// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.raywenderlich.android.whysoserious.firebase.authentication;

import com.google.firebase.auth.FirebaseAuth;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class FirebaseAuthenticationManager_Factory
    implements Factory<FirebaseAuthenticationManager> {
  private final Provider<FirebaseAuth> authenticationProvider;

  public FirebaseAuthenticationManager_Factory(Provider<FirebaseAuth> authenticationProvider) {
    this.authenticationProvider = authenticationProvider;
  }

  @Override
  public FirebaseAuthenticationManager get() {
    return new FirebaseAuthenticationManager(authenticationProvider.get());
  }

  public static Factory<FirebaseAuthenticationManager> create(
      Provider<FirebaseAuth> authenticationProvider) {
    return new FirebaseAuthenticationManager_Factory(authenticationProvider);
  }
}