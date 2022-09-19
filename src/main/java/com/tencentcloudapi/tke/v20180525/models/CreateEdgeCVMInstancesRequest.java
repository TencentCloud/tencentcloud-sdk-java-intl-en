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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEdgeCVMInstancesRequest extends AbstractModel{

    /**
    * Cluster ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * Pass-through parameter for CVM creation in the format of a JSON string. To ensure the idempotency of requests for adding cluster nodes, you need to add the `ClientToken` field in this parameter. For more information, see the documentation for [RunInstances](https://intl.cloud.tencent.com/document/product/213/15730?from_cn_redirect=1) API.
    */
    @SerializedName("RunInstancePara")
    @Expose
    private String RunInstancePara;

    /**
    * Region of the CVM instances to create
    */
    @SerializedName("CvmRegion")
    @Expose
    private String CvmRegion;

    /**
    * Quantity of CVM instances to create
    */
    @SerializedName("CvmCount")
    @Expose
    private Long CvmCount;

    /**
    * Instance extension information
    */
    @SerializedName("External")
    @Expose
    private String External;

    /**
    * Custom script
    */
    @SerializedName("UserScript")
    @Expose
    private String UserScript;

    /**
    * Whether to enable ENI
    */
    @SerializedName("EnableEni")
    @Expose
    private Boolean EnableEni;

    /**
     * Get Cluster ID 
     * @return ClusterID Cluster ID
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set Cluster ID
     * @param ClusterID Cluster ID
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get Pass-through parameter for CVM creation in the format of a JSON string. To ensure the idempotency of requests for adding cluster nodes, you need to add the `ClientToken` field in this parameter. For more information, see the documentation for [RunInstances](https://intl.cloud.tencent.com/document/product/213/15730?from_cn_redirect=1) API. 
     * @return RunInstancePara Pass-through parameter for CVM creation in the format of a JSON string. To ensure the idempotency of requests for adding cluster nodes, you need to add the `ClientToken` field in this parameter. For more information, see the documentation for [RunInstances](https://intl.cloud.tencent.com/document/product/213/15730?from_cn_redirect=1) API.
     */
    public String getRunInstancePara() {
        return this.RunInstancePara;
    }

    /**
     * Set Pass-through parameter for CVM creation in the format of a JSON string. To ensure the idempotency of requests for adding cluster nodes, you need to add the `ClientToken` field in this parameter. For more information, see the documentation for [RunInstances](https://intl.cloud.tencent.com/document/product/213/15730?from_cn_redirect=1) API.
     * @param RunInstancePara Pass-through parameter for CVM creation in the format of a JSON string. To ensure the idempotency of requests for adding cluster nodes, you need to add the `ClientToken` field in this parameter. For more information, see the documentation for [RunInstances](https://intl.cloud.tencent.com/document/product/213/15730?from_cn_redirect=1) API.
     */
    public void setRunInstancePara(String RunInstancePara) {
        this.RunInstancePara = RunInstancePara;
    }

    /**
     * Get Region of the CVM instances to create 
     * @return CvmRegion Region of the CVM instances to create
     */
    public String getCvmRegion() {
        return this.CvmRegion;
    }

    /**
     * Set Region of the CVM instances to create
     * @param CvmRegion Region of the CVM instances to create
     */
    public void setCvmRegion(String CvmRegion) {
        this.CvmRegion = CvmRegion;
    }

    /**
     * Get Quantity of CVM instances to create 
     * @return CvmCount Quantity of CVM instances to create
     */
    public Long getCvmCount() {
        return this.CvmCount;
    }

    /**
     * Set Quantity of CVM instances to create
     * @param CvmCount Quantity of CVM instances to create
     */
    public void setCvmCount(Long CvmCount) {
        this.CvmCount = CvmCount;
    }

    /**
     * Get Instance extension information 
     * @return External Instance extension information
     */
    public String getExternal() {
        return this.External;
    }

    /**
     * Set Instance extension information
     * @param External Instance extension information
     */
    public void setExternal(String External) {
        this.External = External;
    }

    /**
     * Get Custom script 
     * @return UserScript Custom script
     */
    public String getUserScript() {
        return this.UserScript;
    }

    /**
     * Set Custom script
     * @param UserScript Custom script
     */
    public void setUserScript(String UserScript) {
        this.UserScript = UserScript;
    }

    /**
     * Get Whether to enable ENI 
     * @return EnableEni Whether to enable ENI
     */
    public Boolean getEnableEni() {
        return this.EnableEni;
    }

    /**
     * Set Whether to enable ENI
     * @param EnableEni Whether to enable ENI
     */
    public void setEnableEni(Boolean EnableEni) {
        this.EnableEni = EnableEni;
    }

    public CreateEdgeCVMInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEdgeCVMInstancesRequest(CreateEdgeCVMInstancesRequest source) {
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.RunInstancePara != null) {
            this.RunInstancePara = new String(source.RunInstancePara);
        }
        if (source.CvmRegion != null) {
            this.CvmRegion = new String(source.CvmRegion);
        }
        if (source.CvmCount != null) {
            this.CvmCount = new Long(source.CvmCount);
        }
        if (source.External != null) {
            this.External = new String(source.External);
        }
        if (source.UserScript != null) {
            this.UserScript = new String(source.UserScript);
        }
        if (source.EnableEni != null) {
            this.EnableEni = new Boolean(source.EnableEni);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "RunInstancePara", this.RunInstancePara);
        this.setParamSimple(map, prefix + "CvmRegion", this.CvmRegion);
        this.setParamSimple(map, prefix + "CvmCount", this.CvmCount);
        this.setParamSimple(map, prefix + "External", this.External);
        this.setParamSimple(map, prefix + "UserScript", this.UserScript);
        this.setParamSimple(map, prefix + "EnableEni", this.EnableEni);

    }
}

