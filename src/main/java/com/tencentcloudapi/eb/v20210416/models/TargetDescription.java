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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetDescription extends AbstractModel{

    /**
    * Six-Segment QCS resource description. For more information, see [Resource Description Method](https://intl.cloud.tencent.com/document/product/598/10606?from_cn_redirect=1)
    */
    @SerializedName("ResourceDescription")
    @Expose
    private String ResourceDescription;

    /**
    * SCF parameter
    */
    @SerializedName("SCFParams")
    @Expose
    private SCFParams SCFParams;

    /**
    * CKafka parameters
    */
    @SerializedName("CkafkaTargetParams")
    @Expose
    private CkafkaTargetParams CkafkaTargetParams;

    /**
    * ElasticSearch parameters
    */
    @SerializedName("ESTargetParams")
    @Expose
    private ESTargetParams ESTargetParams;

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
     * Get SCF parameter 
     * @return SCFParams SCF parameter
     */
    public SCFParams getSCFParams() {
        return this.SCFParams;
    }

    /**
     * Set SCF parameter
     * @param SCFParams SCF parameter
     */
    public void setSCFParams(SCFParams SCFParams) {
        this.SCFParams = SCFParams;
    }

    /**
     * Get CKafka parameters 
     * @return CkafkaTargetParams CKafka parameters
     */
    public CkafkaTargetParams getCkafkaTargetParams() {
        return this.CkafkaTargetParams;
    }

    /**
     * Set CKafka parameters
     * @param CkafkaTargetParams CKafka parameters
     */
    public void setCkafkaTargetParams(CkafkaTargetParams CkafkaTargetParams) {
        this.CkafkaTargetParams = CkafkaTargetParams;
    }

    /**
     * Get ElasticSearch parameters 
     * @return ESTargetParams ElasticSearch parameters
     */
    public ESTargetParams getESTargetParams() {
        return this.ESTargetParams;
    }

    /**
     * Set ElasticSearch parameters
     * @param ESTargetParams ElasticSearch parameters
     */
    public void setESTargetParams(ESTargetParams ESTargetParams) {
        this.ESTargetParams = ESTargetParams;
    }

    public TargetDescription() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetDescription(TargetDescription source) {
        if (source.ResourceDescription != null) {
            this.ResourceDescription = new String(source.ResourceDescription);
        }
        if (source.SCFParams != null) {
            this.SCFParams = new SCFParams(source.SCFParams);
        }
        if (source.CkafkaTargetParams != null) {
            this.CkafkaTargetParams = new CkafkaTargetParams(source.CkafkaTargetParams);
        }
        if (source.ESTargetParams != null) {
            this.ESTargetParams = new ESTargetParams(source.ESTargetParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceDescription", this.ResourceDescription);
        this.setParamObj(map, prefix + "SCFParams.", this.SCFParams);
        this.setParamObj(map, prefix + "CkafkaTargetParams.", this.CkafkaTargetParams);
        this.setParamObj(map, prefix + "ESTargetParams.", this.ESTargetParams);

    }
}

