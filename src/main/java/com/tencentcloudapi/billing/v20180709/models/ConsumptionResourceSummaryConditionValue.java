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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsumptionResourceSummaryConditionValue extends AbstractModel {

    /**
    * Product list
    */
    @SerializedName("Business")
    @Expose
    private ConditionBusiness [] Business;

    /**
    * Project list
    */
    @SerializedName("Project")
    @Expose
    private ConditionProject [] Project;

    /**
    * Region list
    */
    @SerializedName("Region")
    @Expose
    private ConditionRegion [] Region;

    /**
    * Payment mode list
    */
    @SerializedName("PayMode")
    @Expose
    private ConditionPayMode [] PayMode;

    /**
     * Get Product list 
     * @return Business Product list
     */
    public ConditionBusiness [] getBusiness() {
        return this.Business;
    }

    /**
     * Set Product list
     * @param Business Product list
     */
    public void setBusiness(ConditionBusiness [] Business) {
        this.Business = Business;
    }

    /**
     * Get Project list 
     * @return Project Project list
     */
    public ConditionProject [] getProject() {
        return this.Project;
    }

    /**
     * Set Project list
     * @param Project Project list
     */
    public void setProject(ConditionProject [] Project) {
        this.Project = Project;
    }

    /**
     * Get Region list 
     * @return Region Region list
     */
    public ConditionRegion [] getRegion() {
        return this.Region;
    }

    /**
     * Set Region list
     * @param Region Region list
     */
    public void setRegion(ConditionRegion [] Region) {
        this.Region = Region;
    }

    /**
     * Get Payment mode list 
     * @return PayMode Payment mode list
     */
    public ConditionPayMode [] getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Payment mode list
     * @param PayMode Payment mode list
     */
    public void setPayMode(ConditionPayMode [] PayMode) {
        this.PayMode = PayMode;
    }

    public ConsumptionResourceSummaryConditionValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumptionResourceSummaryConditionValue(ConsumptionResourceSummaryConditionValue source) {
        if (source.Business != null) {
            this.Business = new ConditionBusiness[source.Business.length];
            for (int i = 0; i < source.Business.length; i++) {
                this.Business[i] = new ConditionBusiness(source.Business[i]);
            }
        }
        if (source.Project != null) {
            this.Project = new ConditionProject[source.Project.length];
            for (int i = 0; i < source.Project.length; i++) {
                this.Project[i] = new ConditionProject(source.Project[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new ConditionRegion[source.Region.length];
            for (int i = 0; i < source.Region.length; i++) {
                this.Region[i] = new ConditionRegion(source.Region[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new ConditionPayMode[source.PayMode.length];
            for (int i = 0; i < source.PayMode.length; i++) {
                this.PayMode[i] = new ConditionPayMode(source.PayMode[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Business.", this.Business);
        this.setParamArrayObj(map, prefix + "Project.", this.Project);
        this.setParamArrayObj(map, prefix + "Region.", this.Region);
        this.setParamArrayObj(map, prefix + "PayMode.", this.PayMode);

    }
}

