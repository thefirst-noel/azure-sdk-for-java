/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.TagResources;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.TagResourceContract;

class TagResourcesImpl extends WrapperImpl<TagResourcesInner> implements TagResources {
    private final ApiManagementManager manager;

    TagResourcesImpl(ApiManagementManager manager) {
        super(manager.inner().tagResources());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public Observable<TagResourceContract> listByServiceAsync(final String resourceGroupName, final String serviceName) {
        TagResourcesInner client = this.inner();
        return client.listByServiceAsync(resourceGroupName, serviceName)
        .flatMapIterable(new Func1<Page<TagResourceContractInner>, Iterable<TagResourceContractInner>>() {
            @Override
            public Iterable<TagResourceContractInner> call(Page<TagResourceContractInner> page) {
                return page.items();
            }
        })
        .map(new Func1<TagResourceContractInner, TagResourceContract>() {
            @Override
            public TagResourceContract call(TagResourceContractInner inner) {
                return new TagResourceContractImpl(inner, manager());
            }
        });
    }

}
