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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConnectionDescription extends AbstractModel {

    /**
    * Six-Segment QCS resource description. For more information, see [Resource Description Method](https://intl.cloud.tencent.com/document/product/598/10606?from_cn_redirect=1)
    */
    @SerializedName("ResourceDescription")
    @Expose
    private String ResourceDescription;

    /**
    * API Gateway parameters
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("APIGWParams")
    @Expose
    private APIGWParams APIGWParams;

    /**
    * CKafka parameters
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CkafkaParams")
    @Expose
    private CkafkaParams CkafkaParams;

    /**
    * Data Transfer Service (DTS) connector information
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DTSParams")
    @Expose
    private DTSParams DTSParams;

    /**
     * Get Six-Segment QCS resource description. For more information, see [Resource Description Method](https://intl.cloud.tencent.com/document/product/598/10606?from_cn_redirect=1) 
     * @return ResourceDescription Six-Segment QCS resource description. For more information, see [Resource Description Method](https://intl.cloud.tencent.com/document/product/598/10606?from_cn_redirect=1)
     */
    public String getResourceDescription() {
        return this.ResourceDescription;
    }

    /**
     * Set Six-Segment QCS resource description. For more information, see [Resource Description Method](https://intl.cloud.tencent.com/document/product/598/10606?from_cn_redirect=1)
     * @param ResourceDescription Six-Segment QCS resource description. For more information, see [Resource Description Method](https://intl.cloud.tencent.com/document/product/598/10606?from_cn_redirect=1)
     */
    public void setResourceDescription(String ResourceDescription) {
        this.ResourceDescription = ResourceDescription;
    }

    /**
     * Get API Gateway parameters
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return APIGWParams API Gateway parameters
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public APIGWParams getAPIGWParams() {
        return this.APIGWParams;
    }

    /**
     * Set API Gateway parameters
Note: this field may return null, indicating that no valid values can be obtained.
     * @param APIGWParams API Gateway parameters
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAPIGWParams(APIGWParams APIGWParams) {
        this.APIGWParams = APIGWParams;
    }

    /**
     * Get CKafka parameters
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CkafkaParams CKafka parameters
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public CkafkaParams getCkafkaParams() {
        return this.CkafkaParams;
    }

    /**
     * Set CKafka parameters
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CkafkaParams CKafka parameters
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCkafkaParams(CkafkaParams CkafkaParams) {
        this.CkafkaParams = CkafkaParams;
    }

    /**
     * Get Data Transfer Service (DTS) connector information
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return DTSParams Data Transfer Service (DTS) connector information
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public DTSParams getDTSParams() {
        return this.DTSParams;
    }

    /**
     * Set Data Transfer Service (DTS) connector information
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param DTSParams Data Transfer Service (DTS) connector information
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDTSParams(DTSParams DTSParams) {
        this.DTSParams = DTSParams;
    }

    public ConnectionDescription() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConnectionDescription(ConnectionDescription source) {
        if (source.ResourceDescription != null) {
            this.ResourceDescription = new String(source.ResourceDescription);
        }
        if (source.APIGWParams != null) {
            this.APIGWParams = new APIGWParams(source.APIGWParams);
        }
        if (source.CkafkaParams != null) {
            this.CkafkaParams = new CkafkaParams(source.CkafkaParams);
        }
        if (source.DTSParams != null) {
            this.DTSParams = new DTSParams(source.DTSParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceDescription", this.ResourceDescription);
        this.setParamObj(map, prefix + "APIGWParams.", this.APIGWParams);
        this.setParamObj(map, prefix + "CkafkaParams.", this.CkafkaParams);
        this.setParamObj(map, prefix + "DTSParams.", this.DTSParams);

    }
}

