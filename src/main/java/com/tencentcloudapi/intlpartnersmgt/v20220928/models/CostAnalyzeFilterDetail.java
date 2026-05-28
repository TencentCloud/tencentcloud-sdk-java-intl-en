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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CostAnalyzeFilterDetail extends AbstractModel {

    /**
    * <p>Product key-value pair.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Business")
    @Expose
    private BillQueryFilterMsg [] Business;

    /**
    * <p>Region key-value pair</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private BillQueryFilterMsg [] Region;

    /**
    * <p>Availability zone key-value pair</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private BillQueryFilterMsg [] Zone;

    /**
    * <p>Transaction type key-value pair</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ActionType")
    @Expose
    private BillQueryFilterMsg [] ActionType;

    /**
    * <p>Key-value pair of payment mode</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PayMode")
    @Expose
    private BillQueryFilterMsg [] PayMode;

    /**
    * <p>Project key-value pair</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Project")
    @Expose
    private BillQueryFilterMsg [] Project;

    /**
    * <p>Payer uin information</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PayerUin")
    @Expose
    private BillQueryFilterMsg [] PayerUin;

    /**
    * <p>Sub-account uin information</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private BillQueryFilterMsg [] OwnerUin;

    /**
     * Get <p>Product key-value pair.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Business <p>Product key-value pair.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BillQueryFilterMsg [] getBusiness() {
        return this.Business;
    }

    /**
     * Set <p>Product key-value pair.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Business <p>Product key-value pair.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBusiness(BillQueryFilterMsg [] Business) {
        this.Business = Business;
    }

    /**
     * Get <p>Region key-value pair</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region <p>Region key-value pair</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BillQueryFilterMsg [] getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region key-value pair</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region <p>Region key-value pair</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(BillQueryFilterMsg [] Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Availability zone key-value pair</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Zone <p>Availability zone key-value pair</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BillQueryFilterMsg [] getZone() {
        return this.Zone;
    }

    /**
     * Set <p>Availability zone key-value pair</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Zone <p>Availability zone key-value pair</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZone(BillQueryFilterMsg [] Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Transaction type key-value pair</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ActionType <p>Transaction type key-value pair</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BillQueryFilterMsg [] getActionType() {
        return this.ActionType;
    }

    /**
     * Set <p>Transaction type key-value pair</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ActionType <p>Transaction type key-value pair</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setActionType(BillQueryFilterMsg [] ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get <p>Key-value pair of payment mode</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PayMode <p>Key-value pair of payment mode</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BillQueryFilterMsg [] getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>Key-value pair of payment mode</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PayMode <p>Key-value pair of payment mode</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPayMode(BillQueryFilterMsg [] PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>Project key-value pair</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Project <p>Project key-value pair</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BillQueryFilterMsg [] getProject() {
        return this.Project;
    }

    /**
     * Set <p>Project key-value pair</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Project <p>Project key-value pair</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProject(BillQueryFilterMsg [] Project) {
        this.Project = Project;
    }

    /**
     * Get <p>Payer uin information</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PayerUin <p>Payer uin information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BillQueryFilterMsg [] getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set <p>Payer uin information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PayerUin <p>Payer uin information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPayerUin(BillQueryFilterMsg [] PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get <p>Sub-account uin information</p> 
     * @return OwnerUin <p>Sub-account uin information</p>
     */
    public BillQueryFilterMsg [] getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>Sub-account uin information</p>
     * @param OwnerUin <p>Sub-account uin information</p>
     */
    public void setOwnerUin(BillQueryFilterMsg [] OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    public CostAnalyzeFilterDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CostAnalyzeFilterDetail(CostAnalyzeFilterDetail source) {
        if (source.Business != null) {
            this.Business = new BillQueryFilterMsg[source.Business.length];
            for (int i = 0; i < source.Business.length; i++) {
                this.Business[i] = new BillQueryFilterMsg(source.Business[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new BillQueryFilterMsg[source.Region.length];
            for (int i = 0; i < source.Region.length; i++) {
                this.Region[i] = new BillQueryFilterMsg(source.Region[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new BillQueryFilterMsg[source.Zone.length];
            for (int i = 0; i < source.Zone.length; i++) {
                this.Zone[i] = new BillQueryFilterMsg(source.Zone[i]);
            }
        }
        if (source.ActionType != null) {
            this.ActionType = new BillQueryFilterMsg[source.ActionType.length];
            for (int i = 0; i < source.ActionType.length; i++) {
                this.ActionType[i] = new BillQueryFilterMsg(source.ActionType[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new BillQueryFilterMsg[source.PayMode.length];
            for (int i = 0; i < source.PayMode.length; i++) {
                this.PayMode[i] = new BillQueryFilterMsg(source.PayMode[i]);
            }
        }
        if (source.Project != null) {
            this.Project = new BillQueryFilterMsg[source.Project.length];
            for (int i = 0; i < source.Project.length; i++) {
                this.Project[i] = new BillQueryFilterMsg(source.Project[i]);
            }
        }
        if (source.PayerUin != null) {
            this.PayerUin = new BillQueryFilterMsg[source.PayerUin.length];
            for (int i = 0; i < source.PayerUin.length; i++) {
                this.PayerUin[i] = new BillQueryFilterMsg(source.PayerUin[i]);
            }
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new BillQueryFilterMsg[source.OwnerUin.length];
            for (int i = 0; i < source.OwnerUin.length; i++) {
                this.OwnerUin[i] = new BillQueryFilterMsg(source.OwnerUin[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Business.", this.Business);
        this.setParamArrayObj(map, prefix + "Region.", this.Region);
        this.setParamArrayObj(map, prefix + "Zone.", this.Zone);
        this.setParamArrayObj(map, prefix + "ActionType.", this.ActionType);
        this.setParamArrayObj(map, prefix + "PayMode.", this.PayMode);
        this.setParamArrayObj(map, prefix + "Project.", this.Project);
        this.setParamArrayObj(map, prefix + "PayerUin.", this.PayerUin);
        this.setParamArrayObj(map, prefix + "OwnerUin.", this.OwnerUin);

    }
}

