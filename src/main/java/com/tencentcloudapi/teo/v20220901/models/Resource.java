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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Resource extends AbstractModel {

    /**
    * Resource ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Payment mode. Valid values:
<li>0: postpaid.</li>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Effective time.
    */
    @SerializedName("EnableTime")
    @Expose
    private String EnableTime;

    /**
    * Expiration time.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Package status. Valid values:
<li>normal: Normal;</li>
<li>isolated: Isolated;</li>
<li>destroyed: Terminated.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Price inquiry parameters.
    */
    @SerializedName("Sv")
    @Expose
    private Sv [] Sv;

    /**
    * Whether it is automatically renewed. Valid values:
<li>0: default state</li>
<li>`1`: auto-renewal;</li>
<li>`2`: no auto-renewal.</li>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * ID of the associated resource in the package.
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * Region. Valid values:
<li>mainland: within the Chinese mainland;</li>
<li>overseas: outside the Chinese mainland.</li>
<li>global: global.</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Resource type. Valid values:
<li>plan: package type;</li>
<li>pay-as-you-go: postpaid mode.</li>
<li>value-added: value-added service type.</li>
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * Number of sites bound to the current resource.
    */
    @SerializedName("ZoneNumber")
    @Expose
    private Long ZoneNumber;

    /**
    * Resource tag type, with values:
<li>vodeo: vodeo resource.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Resource ID. 
     * @return Id Resource ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Resource ID.
     * @param Id Resource ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Payment mode. Valid values:
<li>0: postpaid.</li> 
     * @return PayMode Payment mode. Valid values:
<li>0: postpaid.</li>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Payment mode. Valid values:
<li>0: postpaid.</li>
     * @param PayMode Payment mode. Valid values:
<li>0: postpaid.</li>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Effective time. 
     * @return EnableTime Effective time.
     */
    public String getEnableTime() {
        return this.EnableTime;
    }

    /**
     * Set Effective time.
     * @param EnableTime Effective time.
     */
    public void setEnableTime(String EnableTime) {
        this.EnableTime = EnableTime;
    }

    /**
     * Get Expiration time. 
     * @return ExpireTime Expiration time.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time.
     * @param ExpireTime Expiration time.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Package status. Valid values:
<li>normal: Normal;</li>
<li>isolated: Isolated;</li>
<li>destroyed: Terminated.</li> 
     * @return Status Package status. Valid values:
<li>normal: Normal;</li>
<li>isolated: Isolated;</li>
<li>destroyed: Terminated.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Package status. Valid values:
<li>normal: Normal;</li>
<li>isolated: Isolated;</li>
<li>destroyed: Terminated.</li>
     * @param Status Package status. Valid values:
<li>normal: Normal;</li>
<li>isolated: Isolated;</li>
<li>destroyed: Terminated.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Price inquiry parameters. 
     * @return Sv Price inquiry parameters.
     */
    public Sv [] getSv() {
        return this.Sv;
    }

    /**
     * Set Price inquiry parameters.
     * @param Sv Price inquiry parameters.
     */
    public void setSv(Sv [] Sv) {
        this.Sv = Sv;
    }

    /**
     * Get Whether it is automatically renewed. Valid values:
<li>0: default state</li>
<li>`1`: auto-renewal;</li>
<li>`2`: no auto-renewal.</li> 
     * @return AutoRenewFlag Whether it is automatically renewed. Valid values:
<li>0: default state</li>
<li>`1`: auto-renewal;</li>
<li>`2`: no auto-renewal.</li>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Whether it is automatically renewed. Valid values:
<li>0: default state</li>
<li>`1`: auto-renewal;</li>
<li>`2`: no auto-renewal.</li>
     * @param AutoRenewFlag Whether it is automatically renewed. Valid values:
<li>0: default state</li>
<li>`1`: auto-renewal;</li>
<li>`2`: no auto-renewal.</li>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get ID of the associated resource in the package. 
     * @return PlanId ID of the associated resource in the package.
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set ID of the associated resource in the package.
     * @param PlanId ID of the associated resource in the package.
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get Region. Valid values:
<li>mainland: within the Chinese mainland;</li>
<li>overseas: outside the Chinese mainland.</li>
<li>global: global.</li> 
     * @return Area Region. Valid values:
<li>mainland: within the Chinese mainland;</li>
<li>overseas: outside the Chinese mainland.</li>
<li>global: global.</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Region. Valid values:
<li>mainland: within the Chinese mainland;</li>
<li>overseas: outside the Chinese mainland.</li>
<li>global: global.</li>
     * @param Area Region. Valid values:
<li>mainland: within the Chinese mainland;</li>
<li>overseas: outside the Chinese mainland.</li>
<li>global: global.</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Resource type. Valid values:
<li>plan: package type;</li>
<li>pay-as-you-go: postpaid mode.</li>
<li>value-added: value-added service type.</li> 
     * @return Group Resource type. Valid values:
<li>plan: package type;</li>
<li>pay-as-you-go: postpaid mode.</li>
<li>value-added: value-added service type.</li>
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set Resource type. Valid values:
<li>plan: package type;</li>
<li>pay-as-you-go: postpaid mode.</li>
<li>value-added: value-added service type.</li>
     * @param Group Resource type. Valid values:
<li>plan: package type;</li>
<li>pay-as-you-go: postpaid mode.</li>
<li>value-added: value-added service type.</li>
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get Number of sites bound to the current resource. 
     * @return ZoneNumber Number of sites bound to the current resource.
     */
    public Long getZoneNumber() {
        return this.ZoneNumber;
    }

    /**
     * Set Number of sites bound to the current resource.
     * @param ZoneNumber Number of sites bound to the current resource.
     */
    public void setZoneNumber(Long ZoneNumber) {
        this.ZoneNumber = ZoneNumber;
    }

    /**
     * Get Resource tag type, with values:
<li>vodeo: vodeo resource.</li> 
     * @return Type Resource tag type, with values:
<li>vodeo: vodeo resource.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Resource tag type, with values:
<li>vodeo: vodeo resource.</li>
     * @param Type Resource tag type, with values:
<li>vodeo: vodeo resource.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public Resource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Resource(Resource source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.EnableTime != null) {
            this.EnableTime = new String(source.EnableTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Sv != null) {
            this.Sv = new Sv[source.Sv.length];
            for (int i = 0; i < source.Sv.length; i++) {
                this.Sv[i] = new Sv(source.Sv[i]);
            }
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.ZoneNumber != null) {
            this.ZoneNumber = new Long(source.ZoneNumber);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EnableTime", this.EnableTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Sv.", this.Sv);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "ZoneNumber", this.ZoneNumber);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

