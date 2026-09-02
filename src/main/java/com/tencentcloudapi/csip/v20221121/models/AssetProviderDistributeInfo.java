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

public class AssetProviderDistributeInfo extends AbstractModel {

    /**
    * <p>Total number of Tencent Cloud assets</p>
    */
    @SerializedName("TencentAssetCount")
    @Expose
    private Long TencentAssetCount;

    /**
    * <p>Total number of Alibaba Cloud assets</p>
    */
    @SerializedName("AliAssetCount")
    @Expose
    private Long AliAssetCount;

    /**
    * <p>Total number of Amazon Web Services assets</p>
    */
    @SerializedName("AwsAssetCount")
    @Expose
    private Long AwsAssetCount;

    /**
    * <p>Total number of assets in other cloud environments</p>
    */
    @SerializedName("OtherAssetCount")
    @Expose
    private Long OtherAssetCount;

    /**
    * <p>Number of Microsoft cloud assets</p>
    */
    @SerializedName("AzureAssetCount")
    @Expose
    private Long AzureAssetCount;

    /**
     * Get <p>Total number of Tencent Cloud assets</p> 
     * @return TencentAssetCount <p>Total number of Tencent Cloud assets</p>
     */
    public Long getTencentAssetCount() {
        return this.TencentAssetCount;
    }

    /**
     * Set <p>Total number of Tencent Cloud assets</p>
     * @param TencentAssetCount <p>Total number of Tencent Cloud assets</p>
     */
    public void setTencentAssetCount(Long TencentAssetCount) {
        this.TencentAssetCount = TencentAssetCount;
    }

    /**
     * Get <p>Total number of Alibaba Cloud assets</p> 
     * @return AliAssetCount <p>Total number of Alibaba Cloud assets</p>
     */
    public Long getAliAssetCount() {
        return this.AliAssetCount;
    }

    /**
     * Set <p>Total number of Alibaba Cloud assets</p>
     * @param AliAssetCount <p>Total number of Alibaba Cloud assets</p>
     */
    public void setAliAssetCount(Long AliAssetCount) {
        this.AliAssetCount = AliAssetCount;
    }

    /**
     * Get <p>Total number of Amazon Web Services assets</p> 
     * @return AwsAssetCount <p>Total number of Amazon Web Services assets</p>
     */
    public Long getAwsAssetCount() {
        return this.AwsAssetCount;
    }

    /**
     * Set <p>Total number of Amazon Web Services assets</p>
     * @param AwsAssetCount <p>Total number of Amazon Web Services assets</p>
     */
    public void setAwsAssetCount(Long AwsAssetCount) {
        this.AwsAssetCount = AwsAssetCount;
    }

    /**
     * Get <p>Total number of assets in other cloud environments</p> 
     * @return OtherAssetCount <p>Total number of assets in other cloud environments</p>
     */
    public Long getOtherAssetCount() {
        return this.OtherAssetCount;
    }

    /**
     * Set <p>Total number of assets in other cloud environments</p>
     * @param OtherAssetCount <p>Total number of assets in other cloud environments</p>
     */
    public void setOtherAssetCount(Long OtherAssetCount) {
        this.OtherAssetCount = OtherAssetCount;
    }

    /**
     * Get <p>Number of Microsoft cloud assets</p> 
     * @return AzureAssetCount <p>Number of Microsoft cloud assets</p>
     */
    public Long getAzureAssetCount() {
        return this.AzureAssetCount;
    }

    /**
     * Set <p>Number of Microsoft cloud assets</p>
     * @param AzureAssetCount <p>Number of Microsoft cloud assets</p>
     */
    public void setAzureAssetCount(Long AzureAssetCount) {
        this.AzureAssetCount = AzureAssetCount;
    }

    public AssetProviderDistributeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetProviderDistributeInfo(AssetProviderDistributeInfo source) {
        if (source.TencentAssetCount != null) {
            this.TencentAssetCount = new Long(source.TencentAssetCount);
        }
        if (source.AliAssetCount != null) {
            this.AliAssetCount = new Long(source.AliAssetCount);
        }
        if (source.AwsAssetCount != null) {
            this.AwsAssetCount = new Long(source.AwsAssetCount);
        }
        if (source.OtherAssetCount != null) {
            this.OtherAssetCount = new Long(source.OtherAssetCount);
        }
        if (source.AzureAssetCount != null) {
            this.AzureAssetCount = new Long(source.AzureAssetCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TencentAssetCount", this.TencentAssetCount);
        this.setParamSimple(map, prefix + "AliAssetCount", this.AliAssetCount);
        this.setParamSimple(map, prefix + "AwsAssetCount", this.AwsAssetCount);
        this.setParamSimple(map, prefix + "OtherAssetCount", this.OtherAssetCount);
        this.setParamSimple(map, prefix + "AzureAssetCount", this.AzureAssetCount);

    }
}

