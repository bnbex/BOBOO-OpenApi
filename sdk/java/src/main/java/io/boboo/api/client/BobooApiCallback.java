package io.boboo.api.client;

/**
 * BobooApiCallback is a functional interface used together with the BobooApiAsyncClient to provide a non-blocking REST client.
 *
 * @param <T> the return type from the callback
 */
@FunctionalInterface
public interface BobooApiCallback<T> {

    /**
     * Called whenever a response comes back from the BOBOO API.
     *
     * @param response the expected response object
     */
    void onResponse(T response);

    /**
     * Called whenever an error occurs.
     *
     * @param cause the cause of the failure
     */
    default void onFailure(Throwable cause) {
    }
}
