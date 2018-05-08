/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.iothub.v2018_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.iothub.v2018_04_01.Skus;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.iothub.v2018_04_01.IotHubSkuDescription;

class SkusImpl extends WrapperImpl<IotHubResourcesInner> implements Skus {
    private final IoTHubManager manager;

    SkusImpl(IoTHubManager manager) {
        super(manager.inner().iotHubResources());
        this.manager = manager;
    }

    public IoTHubManager manager() {
        return this.manager;
    }

    private IotHubSkuDescriptionImpl wrapModel(IotHubSkuDescriptionInner inner) {
        return  new IotHubSkuDescriptionImpl(inner, manager());
    }

    private Observable<Page<IotHubSkuDescriptionInner>> listByIotHubNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        IotHubResourcesInner client = this.inner();
        return client.getValidSkusNextAsync(nextLink)
        .flatMap(new Func1<Page<IotHubSkuDescriptionInner>, Observable<Page<IotHubSkuDescriptionInner>>>() {
            @Override
            public Observable<Page<IotHubSkuDescriptionInner>> call(Page<IotHubSkuDescriptionInner> page) {
                return Observable.just(page).concatWith(listByIotHubNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<IotHubSkuDescription> listByIotHubAsync(final String resourceGroupName, final String resourceName) {
        IotHubResourcesInner client = this.inner();
        return client.getValidSkusAsync(resourceGroupName, resourceName)
        .flatMap(new Func1<Page<IotHubSkuDescriptionInner>, Observable<Page<IotHubSkuDescriptionInner>>>() {
            @Override
            public Observable<Page<IotHubSkuDescriptionInner>> call(Page<IotHubSkuDescriptionInner> page) {
                return listByIotHubNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<IotHubSkuDescriptionInner>, Iterable<IotHubSkuDescriptionInner>>() {
            @Override
            public Iterable<IotHubSkuDescriptionInner> call(Page<IotHubSkuDescriptionInner> page) {
                return page.items();
            }
       })
        .map(new Func1<IotHubSkuDescriptionInner, IotHubSkuDescription>() {
            @Override
            public IotHubSkuDescription call(IotHubSkuDescriptionInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
