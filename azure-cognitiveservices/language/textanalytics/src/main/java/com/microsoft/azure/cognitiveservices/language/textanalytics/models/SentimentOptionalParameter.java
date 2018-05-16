/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.textanalytics.models;

import java.util.List;

/**
 * The optional parameters class for "sentiment" method.
 */
public class SentimentOptionalParameter {
    /**
    * The documents value.
    */
    private List<MultiLanguageInput> documents;

    /**
    * Get the documents value.
    *
    * @return the documents value
    */
    public List<MultiLanguageInput> documents() {
        return this.documents;
    }

    /**
    * Set the documents value.
    * <p>
    * The documents value.
    *
    * @param documents the documents value to set
    * @return the sentimentOptionalParameter object itself.
    */
    public SentimentOptionalParameter withDocuments(List<MultiLanguageInput> documents) {
        this.documents = documents;
        return this;
    }

    }