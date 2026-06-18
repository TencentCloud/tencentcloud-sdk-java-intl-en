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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudCountDesc extends AbstractModel {

    /**
    * 0 means Tencent Cloud
1 indicates AWS
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
    * Account Quantity
    */
    @SerializedName("CloudCount")
    @Expose
    private Long CloudCount;

    /**
    * Description of The Cloud Account Type
    */
    @SerializedName("CloudDesc")
    @Expose
    private String CloudDesc;

    /**
     * Get 0 means Tencent Cloud
1 indicates AWS 
     * @return CloudType 0 means Tencent Cloud
1 indicates AWS
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set 0 means Tencent Cloud
1 indicates AWS
     * @param CloudType 0 means Tencent Cloud
1 indicates AWS
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get Account Quantity 
     * @return CloudCount Account Quantity
     */
    public Long getCloudCount() {
        return this.CloudCount;
    }

    /**
     * Set Account Quantity
     * @param CloudCount Account Quantity
     */
    public void setCloudCount(Long CloudCount) {
        this.CloudCount = CloudCount;
    }

    /**
     * Get Description of The Cloud Account Type 
     * @return CloudDesc Description of The Cloud Account Type
     */
    public String getCloudDesc() {
        return this.CloudDesc;
    }

    /**
     * Set Description of The Cloud Account Type
     * @param CloudDesc Description of The Cloud Account Type
     */
    public void setCloudDesc(String CloudDesc) {
        this.CloudDesc = CloudDesc;
    }

    public CloudCountDesc() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudCountDesc(CloudCountDesc source) {
        if (source.CloudType != null) {
            this.CloudType = new Long(source.CloudType);
        }
        if (source.CloudCount != null) {
            this.CloudCount = new Long(source.CloudCount);
        }
        if (source.CloudDesc != null) {
            this.CloudDesc = new String(source.CloudDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "CloudCount", this.CloudCount);
        this.setParamSimple(map, prefix + "CloudDesc", this.CloudDesc);

    }
}

