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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSQLExecutionPlanRequest extends AbstractModel {

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>SQL Template ID</p>
    */
    @SerializedName("TemplateID")
    @Expose
    private String TemplateID;

    /**
    * <p>Plan details serial number</p>
    */
    @SerializedName("PlanDetailId")
    @Expose
    private Long PlanDetailId;

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterId <p>Cluster ID.</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterId <p>Cluster ID.</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>SQL Template ID</p> 
     * @return TemplateID <p>SQL Template ID</p>
     */
    public String getTemplateID() {
        return this.TemplateID;
    }

    /**
     * Set <p>SQL Template ID</p>
     * @param TemplateID <p>SQL Template ID</p>
     */
    public void setTemplateID(String TemplateID) {
        this.TemplateID = TemplateID;
    }

    /**
     * Get <p>Plan details serial number</p> 
     * @return PlanDetailId <p>Plan details serial number</p>
     */
    public Long getPlanDetailId() {
        return this.PlanDetailId;
    }

    /**
     * Set <p>Plan details serial number</p>
     * @param PlanDetailId <p>Plan details serial number</p>
     */
    public void setPlanDetailId(Long PlanDetailId) {
        this.PlanDetailId = PlanDetailId;
    }

    public DescribeSQLExecutionPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSQLExecutionPlanRequest(DescribeSQLExecutionPlanRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TemplateID != null) {
            this.TemplateID = new String(source.TemplateID);
        }
        if (source.PlanDetailId != null) {
            this.PlanDetailId = new Long(source.PlanDetailId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TemplateID", this.TemplateID);
        this.setParamSimple(map, prefix + "PlanDetailId", this.PlanDetailId);

    }
}

