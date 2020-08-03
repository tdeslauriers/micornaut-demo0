package example.micronaut.security;

import java.util.ArrayList;

import javax.inject.Singleton;

import org.reactivestreams.Publisher;

import io.micronaut.http.HttpRequest;
import io.micronaut.security.authentication.AuthenticationException;
import io.micronaut.security.authentication.AuthenticationFailed;
import io.micronaut.security.authentication.AuthenticationProvider;
import io.micronaut.security.authentication.AuthenticationRequest;
import io.micronaut.security.authentication.AuthenticationResponse;
import io.micronaut.security.authentication.UserDetails;
import io.reactivex.Maybe;


@Singleton
public class DemoAuthenticationProvider implements AuthenticationProvider {
	
	// Demo purposes only.  Simplified to test microservices' auth.
	
	@Override
    public Publisher<AuthenticationResponse> authenticate(HttpRequest<?> httpRequest, AuthenticationRequest<?, ?> authenticationRequest) {
        return Maybe.<AuthenticationResponse>create(emitter -> {
            if (authenticationRequest.getIdentity().equals("tomtom") && authenticationRequest.getSecret().equals("terrible")) {
                emitter.onSuccess(new UserDetails("user", new ArrayList<>()));
            } else {
                emitter.onError(new AuthenticationException(new AuthenticationFailed()));
            }
        }).toFlowable();
    }

}
