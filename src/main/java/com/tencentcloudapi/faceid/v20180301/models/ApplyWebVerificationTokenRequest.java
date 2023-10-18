/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyWebVerificationTokenRequest extends AbstractModel {

    /**
    * The web redirect URL after the verification is completed.
    */
    @SerializedName("RedirectUrl")
    @Expose
    private String RedirectUrl;

    /**
    * The COS URL of the image for face comparison, which can be obtained with one of the following methods:
1. Call the `CreateUploadUrl` API to generate a URL and call it again after the image is successfully uploaded.
2. Use an existing COS URL. For a private bucket, grant the download permission with a pre-signed URL. The corresponding COS bucket must be in the same region as the input parameter `Region`.
    */
    @SerializedName("CompareImageUrl")
    @Expose
    private String CompareImageUrl;

    /**
    * The MD5 hash values of the image for face comparison (CompareImageUrl).
    */
    @SerializedName("CompareImageMd5")
    @Expose
    private String CompareImageMd5;

    /**
     * Get The web redirect URL after the verification is completed. 
     * @return RedirectUrl The web redirect URL after the verification is completed.
     */
    public String getRedirectUrl() {
        return this.RedirectUrl;
    }

    /**
     * Set The web redirect URL after the verification is completed.
     * @param RedirectUrl The web redirect URL after the verification is completed.
     */
    public void setRedirectUrl(String RedirectUrl) {
        this.RedirectUrl = RedirectUrl;
    }

    /**
     * Get The COS URL of the image for face comparison, which can be obtained with one of the following methods:
1. Call the `CreateUploadUrl` API to generate a URL and call it again after the image is successfully uploaded.
2. Use an existing COS URL. For a private bucket, grant the download permission with a pre-signed URL. The corresponding COS bucket must be in the same region as the input parameter `Region`. 
     * @return CompareImageUrl The COS URL of the image for face comparison, which can be obtained with one of the following methods:
1. Call the `CreateUploadUrl` API to generate a URL and call it again after the image is successfully uploaded.
2. Use an existing COS URL. For a private bucket, grant the download permission with a pre-signed URL. The corresponding COS bucket must be in the same region as the input parameter `Region`.
     */
    public String getCompareImageUrl() {
        return this.CompareImageUrl;
    }

    /**
     * Set The COS URL of the image for face comparison, which can be obtained with one of the following methods:
1. Call the `CreateUploadUrl` API to generate a URL and call it again after the image is successfully uploaded.
2. Use an existing COS URL. For a private bucket, grant the download permission with a pre-signed URL. The corresponding COS bucket must be in the same region as the input parameter `Region`.
     * @param CompareImageUrl The COS URL of the image for face comparison, which can be obtained with one of the following methods:
1. Call the `CreateUploadUrl` API to generate a URL and call it again after the image is successfully uploaded.
2. Use an existing COS URL. For a private bucket, grant the download permission with a pre-signed URL. The corresponding COS bucket must be in the same region as the input parameter `Region`.
     */
    public void setCompareImageUrl(String CompareImageUrl) {
        this.CompareImageUrl = CompareImageUrl;
    }

    /**
     * Get The MD5 hash values of the image for face comparison (CompareImageUrl). 
     * @return CompareImageMd5 The MD5 hash values of the image for face comparison (CompareImageUrl).
     */
    public String getCompareImageMd5() {
        return this.CompareImageMd5;
    }

    /**
     * Set The MD5 hash values of the image for face comparison (CompareImageUrl).
     * @param CompareImageMd5 The MD5 hash values of the image for face comparison (CompareImageUrl).
     */
    public void setCompareImageMd5(String CompareImageMd5) {
        this.CompareImageMd5 = CompareImageMd5;
    }

    public ApplyWebVerificationTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyWebVerificationTokenRequest(ApplyWebVerificationTokenRequest source) {
        if (source.RedirectUrl != null) {
            this.RedirectUrl = new String(source.RedirectUrl);
        }
        if (source.CompareImageUrl != null) {
            this.CompareImageUrl = new String(source.CompareImageUrl);
        }
        if (source.CompareImageMd5 != null) {
            this.CompareImageMd5 = new String(source.CompareImageMd5);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RedirectUrl", this.RedirectUrl);
        this.setParamSimple(map, prefix + "CompareImageUrl", this.CompareImageUrl);
        this.setParamSimple(map, prefix + "CompareImageMd5", this.CompareImageMd5);

    }
}

