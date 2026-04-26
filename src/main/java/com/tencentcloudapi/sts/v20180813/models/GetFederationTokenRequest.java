/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.sts.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFederationTokenRequest extends AbstractModel {

    /**
    * The customizable name of the caller, consisting of letters
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Note:

The policy syntax refers to [CAM's Syntax Logic](https://intl.cloud.tencent.com/document/product/598/10603?from_cn_redirect=1).
The policy cannot contain the principal element.
This parameter needs to be URL-encoded. The server will URL-decode this field and grant temporary access credentials based on the processed policy. Please pass the parameter according to the specification.
    */
    @SerializedName("Policy")
    @Expose
    private String Policy;

    /**
    * The validity period of temporary credentials in seconds. Default value: 1,800s. Maximum value for a root account: 7,200s. Maximum value for a sub-account: 129,600s.
    */
    @SerializedName("DurationSeconds")
    @Expose
    private Long DurationSeconds;

    /**
     * Get The customizable name of the caller, consisting of letters 
     * @return Name The customizable name of the caller, consisting of letters
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The customizable name of the caller, consisting of letters
     * @param Name The customizable name of the caller, consisting of letters
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Note:

The policy syntax refers to [CAM's Syntax Logic](https://intl.cloud.tencent.com/document/product/598/10603?from_cn_redirect=1).
The policy cannot contain the principal element.
This parameter needs to be URL-encoded. The server will URL-decode this field and grant temporary access credentials based on the processed policy. Please pass the parameter according to the specification. 
     * @return Policy Note:

The policy syntax refers to [CAM's Syntax Logic](https://intl.cloud.tencent.com/document/product/598/10603?from_cn_redirect=1).
The policy cannot contain the principal element.
This parameter needs to be URL-encoded. The server will URL-decode this field and grant temporary access credentials based on the processed policy. Please pass the parameter according to the specification.
     */
    public String getPolicy() {
        return this.Policy;
    }

    /**
     * Set Note:

The policy syntax refers to [CAM's Syntax Logic](https://intl.cloud.tencent.com/document/product/598/10603?from_cn_redirect=1).
The policy cannot contain the principal element.
This parameter needs to be URL-encoded. The server will URL-decode this field and grant temporary access credentials based on the processed policy. Please pass the parameter according to the specification.
     * @param Policy Note:

The policy syntax refers to [CAM's Syntax Logic](https://intl.cloud.tencent.com/document/product/598/10603?from_cn_redirect=1).
The policy cannot contain the principal element.
This parameter needs to be URL-encoded. The server will URL-decode this field and grant temporary access credentials based on the processed policy. Please pass the parameter according to the specification.
     */
    public void setPolicy(String Policy) {
        this.Policy = Policy;
    }

    /**
     * Get The validity period of temporary credentials in seconds. Default value: 1,800s. Maximum value for a root account: 7,200s. Maximum value for a sub-account: 129,600s. 
     * @return DurationSeconds The validity period of temporary credentials in seconds. Default value: 1,800s. Maximum value for a root account: 7,200s. Maximum value for a sub-account: 129,600s.
     */
    public Long getDurationSeconds() {
        return this.DurationSeconds;
    }

    /**
     * Set The validity period of temporary credentials in seconds. Default value: 1,800s. Maximum value for a root account: 7,200s. Maximum value for a sub-account: 129,600s.
     * @param DurationSeconds The validity period of temporary credentials in seconds. Default value: 1,800s. Maximum value for a root account: 7,200s. Maximum value for a sub-account: 129,600s.
     */
    public void setDurationSeconds(Long DurationSeconds) {
        this.DurationSeconds = DurationSeconds;
    }

    public GetFederationTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFederationTokenRequest(GetFederationTokenRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Policy != null) {
            this.Policy = new String(source.Policy);
        }
        if (source.DurationSeconds != null) {
            this.DurationSeconds = new Long(source.DurationSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "DurationSeconds", this.DurationSeconds);

    }
}

