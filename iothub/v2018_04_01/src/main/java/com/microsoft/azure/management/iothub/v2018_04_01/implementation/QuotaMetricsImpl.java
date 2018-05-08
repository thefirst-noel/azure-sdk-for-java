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
import com.microsoft.azure.management.iothub.v2018_04_01.QuotaMetrics;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.iothub.v2018_04_01.IotHubQuotaMetricInfo;

class QuotaMetricsImpl extends WrapperImpl<IotHubResourcesInner> implements QuotaMetrics {
    private final IoTHubManager manager;

    QuotaMetricsImpl(IoTHubManager manager) {
        super(manager.inner().iotHubResources());
        this.manager = manager;
    }

    public IoTHubManager manager() {
        return this.manager;
    }

    private IotHubQuotaMetricInfoImpl wrapModel(IotHubQuotaMetricInfoInner inner) {
        return  new IotHubQuotaMetricInfoImpl(inner, manager());
    }

    private Observable<Page<IotHubQuotaMetricInfoInner>> listByIotHubNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        IotHubResourcesInner client = this.inner();
        return client.getQuotaMetricsNextAsync(nextLink)
        .flatMap(new Func1<Page<IotHubQuotaMetricInfoInner>, Observable<Page<IotHubQuotaMetricInfoInner>>>() {
            @Override
            public Observable<Page<IotHubQuotaMetricInfoInner>> call(Page<IotHubQuotaMetricInfoInner> page) {
                return Observable.just(page).concatWith(listByIotHubNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<IotHubQuotaMetricInfo> listByIotHubAsync(final String resourceGroupName, final String resourceName) {
        IotHubResourcesInner client = this.inner();
        return client.getQuotaMetricsAsync(resourceGroupName, resourceName)
        .flatMap(new Func1<Page<IotHubQuotaMetricInfoInner>, Observable<Page<IotHubQuotaMetricInfoInner>>>() {
            @Override
            public Observable<Page<IotHubQuotaMetricInfoInner>> call(Page<IotHubQuotaMetricInfoInner> page) {
                return listByIotHubNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<IotHubQuotaMetricInfoInner>, Iterable<IotHubQuotaMetricInfoInner>>() {
            @Override
            public Iterable<IotHubQuotaMetricInfoInner> call(Page<IotHubQuotaMetricInfoInner> page) {
                return page.items();
            }
       })
        .map(new Func1<IotHubQuotaMetricInfoInner, IotHubQuotaMetricInfo>() {
            @Override
            public IotHubQuotaMetricInfo call(IotHubQuotaMetricInfoInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
