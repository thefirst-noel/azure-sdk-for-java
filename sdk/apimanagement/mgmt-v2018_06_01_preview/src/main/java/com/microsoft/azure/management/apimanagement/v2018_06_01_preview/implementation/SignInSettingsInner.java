/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ErrorResponseException;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.SignInSettingsGetEntityTagHeaders;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.SignInSettingsGetHeaders;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseWithHeaders;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in SignInSettings.
 */
public class SignInSettingsInner {
    /** The Retrofit service to perform REST calls. */
    private SignInSettingsService service;
    /** The service client containing this operation class. */
    private ApiManagementClientImpl client;

    /**
     * Initializes an instance of SignInSettingsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SignInSettingsInner(Retrofit retrofit, ApiManagementClientImpl client) {
        this.service = retrofit.create(SignInSettingsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for SignInSettings to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SignInSettingsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.v2018_06_01_preview.SignInSettings getEntityTag" })
        @HEAD("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/portalsettings/signin")
        Observable<Response<Void>> getEntityTag(@Path("resourceGroupName") String resourceGroupName, @Path("serviceName") String serviceName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.v2018_06_01_preview.SignInSettings get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/portalsettings/signin")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("serviceName") String serviceName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.v2018_06_01_preview.SignInSettings update" })
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/portalsettings/signin")
        Observable<Response<ResponseBody>> update(@Path("resourceGroupName") String resourceGroupName, @Path("serviceName") String serviceName, @Path("subscriptionId") String subscriptionId, @Header("If-Match") String ifMatch, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body PortalSigninSettingsInner parameters, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.v2018_06_01_preview.SignInSettings createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/portalsettings/signin")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("serviceName") String serviceName, @Path("subscriptionId") String subscriptionId, @Header("If-Match") String ifMatch, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body PortalSigninSettingsInner parameters, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the entity state (Etag) version of the SignInSettings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void getEntityTag(String resourceGroupName, String serviceName) {
        getEntityTagWithServiceResponseAsync(resourceGroupName, serviceName).toBlocking().single().body();
    }

    /**
     * Gets the entity state (Etag) version of the SignInSettings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getEntityTagAsync(String resourceGroupName, String serviceName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(getEntityTagWithServiceResponseAsync(resourceGroupName, serviceName), serviceCallback);
    }

    /**
     * Gets the entity state (Etag) version of the SignInSettings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public Observable<Void> getEntityTagAsync(String resourceGroupName, String serviceName) {
        return getEntityTagWithServiceResponseAsync(resourceGroupName, serviceName).map(new Func1<ServiceResponseWithHeaders<Void, SignInSettingsGetEntityTagHeaders>, Void>() {
            @Override
            public Void call(ServiceResponseWithHeaders<Void, SignInSettingsGetEntityTagHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the entity state (Etag) version of the SignInSettings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public Observable<ServiceResponseWithHeaders<Void, SignInSettingsGetEntityTagHeaders>> getEntityTagWithServiceResponseAsync(String resourceGroupName, String serviceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01-preview";
        return service.getEntityTag(resourceGroupName, serviceName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<Void>, Observable<ServiceResponseWithHeaders<Void, SignInSettingsGetEntityTagHeaders>>>() {
                @Override
                public Observable<ServiceResponseWithHeaders<Void, SignInSettingsGetEntityTagHeaders>> call(Response<Void> response) {
                    try {
                        ServiceResponseWithHeaders<Void, SignInSettingsGetEntityTagHeaders> clientResponse = getEntityTagDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponseWithHeaders<Void, SignInSettingsGetEntityTagHeaders> getEntityTagDelegate(Response<Void> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .buildEmptyWithHeaders(response, SignInSettingsGetEntityTagHeaders.class);
    }

    /**
     * Get Sign In Settings for the Portal.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortalSigninSettingsInner object if successful.
     */
    public PortalSigninSettingsInner get(String resourceGroupName, String serviceName) {
        return getWithServiceResponseAsync(resourceGroupName, serviceName).toBlocking().single().body();
    }

    /**
     * Get Sign In Settings for the Portal.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortalSigninSettingsInner> getAsync(String resourceGroupName, String serviceName, final ServiceCallback<PortalSigninSettingsInner> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(getWithServiceResponseAsync(resourceGroupName, serviceName), serviceCallback);
    }

    /**
     * Get Sign In Settings for the Portal.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortalSigninSettingsInner object
     */
    public Observable<PortalSigninSettingsInner> getAsync(String resourceGroupName, String serviceName) {
        return getWithServiceResponseAsync(resourceGroupName, serviceName).map(new Func1<ServiceResponseWithHeaders<PortalSigninSettingsInner, SignInSettingsGetHeaders>, PortalSigninSettingsInner>() {
            @Override
            public PortalSigninSettingsInner call(ServiceResponseWithHeaders<PortalSigninSettingsInner, SignInSettingsGetHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * Get Sign In Settings for the Portal.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortalSigninSettingsInner object
     */
    public Observable<ServiceResponseWithHeaders<PortalSigninSettingsInner, SignInSettingsGetHeaders>> getWithServiceResponseAsync(String resourceGroupName, String serviceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01-preview";
        return service.get(resourceGroupName, serviceName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponseWithHeaders<PortalSigninSettingsInner, SignInSettingsGetHeaders>>>() {
                @Override
                public Observable<ServiceResponseWithHeaders<PortalSigninSettingsInner, SignInSettingsGetHeaders>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponseWithHeaders<PortalSigninSettingsInner, SignInSettingsGetHeaders> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponseWithHeaders<PortalSigninSettingsInner, SignInSettingsGetHeaders> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PortalSigninSettingsInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PortalSigninSettingsInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .buildWithHeaders(response, SignInSettingsGetHeaders.class);
    }

    /**
     * Update Sign-In settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void update(String resourceGroupName, String serviceName, String ifMatch) {
        updateWithServiceResponseAsync(resourceGroupName, serviceName, ifMatch).toBlocking().single().body();
    }

    /**
     * Update Sign-In settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET request or it should be * for unconditional update.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> updateAsync(String resourceGroupName, String serviceName, String ifMatch, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(resourceGroupName, serviceName, ifMatch), serviceCallback);
    }

    /**
     * Update Sign-In settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> updateAsync(String resourceGroupName, String serviceName, String ifMatch) {
        return updateWithServiceResponseAsync(resourceGroupName, serviceName, ifMatch).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Update Sign-In settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> updateWithServiceResponseAsync(String resourceGroupName, String serviceName, String ifMatch) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (ifMatch == null) {
            throw new IllegalArgumentException("Parameter ifMatch is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01-preview";
        final Boolean enabled = null;
        PortalSigninSettingsInner parameters = new PortalSigninSettingsInner();
        parameters.withEnabled(null);
        return service.update(resourceGroupName, serviceName, this.client.subscriptionId(), ifMatch, apiVersion, this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Update Sign-In settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET request or it should be * for unconditional update.
     * @param enabled Redirect Anonymous users to the Sign-In page.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void update(String resourceGroupName, String serviceName, String ifMatch, Boolean enabled) {
        updateWithServiceResponseAsync(resourceGroupName, serviceName, ifMatch, enabled).toBlocking().single().body();
    }

    /**
     * Update Sign-In settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET request or it should be * for unconditional update.
     * @param enabled Redirect Anonymous users to the Sign-In page.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> updateAsync(String resourceGroupName, String serviceName, String ifMatch, Boolean enabled, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(resourceGroupName, serviceName, ifMatch, enabled), serviceCallback);
    }

    /**
     * Update Sign-In settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET request or it should be * for unconditional update.
     * @param enabled Redirect Anonymous users to the Sign-In page.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> updateAsync(String resourceGroupName, String serviceName, String ifMatch, Boolean enabled) {
        return updateWithServiceResponseAsync(resourceGroupName, serviceName, ifMatch, enabled).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Update Sign-In settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET request or it should be * for unconditional update.
     * @param enabled Redirect Anonymous users to the Sign-In page.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> updateWithServiceResponseAsync(String resourceGroupName, String serviceName, String ifMatch, Boolean enabled) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (ifMatch == null) {
            throw new IllegalArgumentException("Parameter ifMatch is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01-preview";
        PortalSigninSettingsInner parameters = new PortalSigninSettingsInner();
        parameters.withEnabled(enabled);
        return service.update(resourceGroupName, serviceName, this.client.subscriptionId(), ifMatch, apiVersion, this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> updateDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Create or Update Sign-In settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortalSigninSettingsInner object if successful.
     */
    public PortalSigninSettingsInner createOrUpdate(String resourceGroupName, String serviceName) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serviceName).toBlocking().single().body();
    }

    /**
     * Create or Update Sign-In settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortalSigninSettingsInner> createOrUpdateAsync(String resourceGroupName, String serviceName, final ServiceCallback<PortalSigninSettingsInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, serviceName), serviceCallback);
    }

    /**
     * Create or Update Sign-In settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortalSigninSettingsInner object
     */
    public Observable<PortalSigninSettingsInner> createOrUpdateAsync(String resourceGroupName, String serviceName) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serviceName).map(new Func1<ServiceResponse<PortalSigninSettingsInner>, PortalSigninSettingsInner>() {
            @Override
            public PortalSigninSettingsInner call(ServiceResponse<PortalSigninSettingsInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create or Update Sign-In settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortalSigninSettingsInner object
     */
    public Observable<ServiceResponse<PortalSigninSettingsInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String serviceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01-preview";
        final String ifMatch = null;
        final Boolean enabled = null;
        PortalSigninSettingsInner parameters = new PortalSigninSettingsInner();
        parameters.withEnabled(null);
        return service.createOrUpdate(resourceGroupName, serviceName, this.client.subscriptionId(), ifMatch, apiVersion, this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortalSigninSettingsInner>>>() {
                @Override
                public Observable<ServiceResponse<PortalSigninSettingsInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortalSigninSettingsInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Create or Update Sign-In settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @param enabled Redirect Anonymous users to the Sign-In page.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortalSigninSettingsInner object if successful.
     */
    public PortalSigninSettingsInner createOrUpdate(String resourceGroupName, String serviceName, String ifMatch, Boolean enabled) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serviceName, ifMatch, enabled).toBlocking().single().body();
    }

    /**
     * Create or Update Sign-In settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @param enabled Redirect Anonymous users to the Sign-In page.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortalSigninSettingsInner> createOrUpdateAsync(String resourceGroupName, String serviceName, String ifMatch, Boolean enabled, final ServiceCallback<PortalSigninSettingsInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, serviceName, ifMatch, enabled), serviceCallback);
    }

    /**
     * Create or Update Sign-In settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @param enabled Redirect Anonymous users to the Sign-In page.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortalSigninSettingsInner object
     */
    public Observable<PortalSigninSettingsInner> createOrUpdateAsync(String resourceGroupName, String serviceName, String ifMatch, Boolean enabled) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serviceName, ifMatch, enabled).map(new Func1<ServiceResponse<PortalSigninSettingsInner>, PortalSigninSettingsInner>() {
            @Override
            public PortalSigninSettingsInner call(ServiceResponse<PortalSigninSettingsInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create or Update Sign-In settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @param enabled Redirect Anonymous users to the Sign-In page.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortalSigninSettingsInner object
     */
    public Observable<ServiceResponse<PortalSigninSettingsInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String serviceName, String ifMatch, Boolean enabled) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01-preview";
        PortalSigninSettingsInner parameters = new PortalSigninSettingsInner();
        parameters.withEnabled(enabled);
        return service.createOrUpdate(resourceGroupName, serviceName, this.client.subscriptionId(), ifMatch, apiVersion, this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortalSigninSettingsInner>>>() {
                @Override
                public Observable<ServiceResponse<PortalSigninSettingsInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortalSigninSettingsInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PortalSigninSettingsInner> createOrUpdateDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PortalSigninSettingsInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PortalSigninSettingsInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
