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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBucketListRequest extends AbstractModel {

    /**
    * Data source service provider. Valid values: `COS` (Tencent Cloud COS), `OSS` (Alibaba Cloud OSS), and `OBS` (Huawei Cloud OBS).
    */
    @SerializedName("SrcService")
    @Expose
    private String SrcService;

    /**
    * SecretId of the data source account

    */
    @SerializedName("SrcSecretId")
    @Expose
    private String SrcSecretId;

    /**
    * SecretKey of the data source account
    */
    @SerializedName("SrcSecretKey")
    @Expose
    private String SrcSecretKey;

    /**
     * Get Data source service provider. Valid values: `COS` (Tencent Cloud COS), `OSS` (Alibaba Cloud OSS), and `OBS` (Huawei Cloud OBS). 
     * @return SrcService Data source service provider. Valid values: `COS` (Tencent Cloud COS), `OSS` (Alibaba Cloud OSS), and `OBS` (Huawei Cloud OBS).
     */
    public String getSrcService() {
        return this.SrcService;
    }

    /**
     * Set Data source service provider. Valid values: `COS` (Tencent Cloud COS), `OSS` (Alibaba Cloud OSS), and `OBS` (Huawei Cloud OBS).
     * @param SrcService Data source service provider. Valid values: `COS` (Tencent Cloud COS), `OSS` (Alibaba Cloud OSS), and `OBS` (Huawei Cloud OBS).
     */
    public void setSrcService(String SrcService) {
        this.SrcService = SrcService;
    }

    /**
     * Get SecretId of the data source account
 
     * @return SrcSecretId SecretId of the data source account

     */
    public String getSrcSecretId() {
        return this.SrcSecretId;
    }

    /**
     * Set SecretId of the data source account

     * @param SrcSecretId SecretId of the data source account

     */
    public void setSrcSecretId(String SrcSecretId) {
        this.SrcSecretId = SrcSecretId;
    }

    /**
     * Get SecretKey of the data source account 
     * @return SrcSecretKey SecretKey of the data source account
     */
    public String getSrcSecretKey() {
        return this.SrcSecretKey;
    }

    /**
     * Set SecretKey of the data source account
     * @param SrcSecretKey SecretKey of the data source account
     */
    public void setSrcSecretKey(String SrcSecretKey) {
        this.SrcSecretKey = SrcSecretKey;
    }

    public DescribeBucketListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBucketListRequest(DescribeBucketListRequest source) {
        if (source.SrcService != null) {
            this.SrcService = new String(source.SrcService);
        }
        if (source.SrcSecretId != null) {
            this.SrcSecretId = new String(source.SrcSecretId);
        }
        if (source.SrcSecretKey != null) {
            this.SrcSecretKey = new String(source.SrcSecretKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcService", this.SrcService);
        this.setParamSimple(map, prefix + "SrcSecretId", this.SrcSecretId);
        this.setParamSimple(map, prefix + "SrcSecretKey", this.SrcSecretKey);

    }
}

