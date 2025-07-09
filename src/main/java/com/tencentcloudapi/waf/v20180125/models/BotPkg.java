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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotPkg extends AbstractModel {

    /**
    * Resource ID

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceIds")
    @Expose
    private String ResourceIds;

    /**
    * Status

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Region

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private Long Region;

    /**
    * Start time

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * End time

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Application Quantity

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InquireNum")
    @Expose
    private Long InquireNum;

    /**
    * Usage Quantity

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UsedNum")
    @Expose
    private Long UsedNum;

    /**
    * Sub-product code.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Renewal flag.	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * Purchase Page Bot 40% Off

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BotCPWaf")
    @Expose
    private Long BotCPWaf;

    /**
    * Console Buy Bot with 50% Off

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BotNPWaf")
    @Expose
    private Long BotNPWaf;

    /**
    * 7-day Bot Trial Identification, 1 for Trial, 0 for No Trial

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsBotTrial")
    @Expose
    private Long IsBotTrial;

    /**
     * Get Resource ID

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceIds Resource ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set Resource ID

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceIds Resource ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceIds(String ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get Status

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Status

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Status

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Region

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region Region

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRegion() {
        return this.Region;
    }

    /**
     * Set Region

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region Region

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(Long Region) {
        this.Region = Region;
    }

    /**
     * Get Start time

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BeginTime Start time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Start time

Note: This field may return null, indicating that no valid values can be obtained.
     * @param BeginTime Start time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get End time

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime End time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time

Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime End time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Application Quantity

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InquireNum Application Quantity

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getInquireNum() {
        return this.InquireNum;
    }

    /**
     * Set Application Quantity

Note: This field may return null, indicating that no valid values can be obtained.
     * @param InquireNum Application Quantity

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInquireNum(Long InquireNum) {
        this.InquireNum = InquireNum;
    }

    /**
     * Get Usage Quantity

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UsedNum Usage Quantity

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUsedNum() {
        return this.UsedNum;
    }

    /**
     * Set Usage Quantity

Note: This field may return null, indicating that no valid values can be obtained.
     * @param UsedNum Usage Quantity

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUsedNum(Long UsedNum) {
        this.UsedNum = UsedNum;
    }

    /**
     * Get Sub-product code.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Sub-product code.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Sub-product code.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Sub-product code.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Renewal flag.	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RenewFlag Renewal flag.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Renewal flag.	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RenewFlag Renewal flag.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Purchase Page Bot 40% Off

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BotCPWaf Purchase Page Bot 40% Off

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBotCPWaf() {
        return this.BotCPWaf;
    }

    /**
     * Set Purchase Page Bot 40% Off

Note: This field may return null, indicating that no valid values can be obtained.
     * @param BotCPWaf Purchase Page Bot 40% Off

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBotCPWaf(Long BotCPWaf) {
        this.BotCPWaf = BotCPWaf;
    }

    /**
     * Get Console Buy Bot with 50% Off

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BotNPWaf Console Buy Bot with 50% Off

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBotNPWaf() {
        return this.BotNPWaf;
    }

    /**
     * Set Console Buy Bot with 50% Off

Note: This field may return null, indicating that no valid values can be obtained.
     * @param BotNPWaf Console Buy Bot with 50% Off

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBotNPWaf(Long BotNPWaf) {
        this.BotNPWaf = BotNPWaf;
    }

    /**
     * Get 7-day Bot Trial Identification, 1 for Trial, 0 for No Trial

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsBotTrial 7-day Bot Trial Identification, 1 for Trial, 0 for No Trial

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsBotTrial() {
        return this.IsBotTrial;
    }

    /**
     * Set 7-day Bot Trial Identification, 1 for Trial, 0 for No Trial

Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsBotTrial 7-day Bot Trial Identification, 1 for Trial, 0 for No Trial

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsBotTrial(Long IsBotTrial) {
        this.IsBotTrial = IsBotTrial;
    }

    public BotPkg() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotPkg(BotPkg source) {
        if (source.ResourceIds != null) {
            this.ResourceIds = new String(source.ResourceIds);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Region != null) {
            this.Region = new Long(source.Region);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.InquireNum != null) {
            this.InquireNum = new Long(source.InquireNum);
        }
        if (source.UsedNum != null) {
            this.UsedNum = new Long(source.UsedNum);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.BotCPWaf != null) {
            this.BotCPWaf = new Long(source.BotCPWaf);
        }
        if (source.BotNPWaf != null) {
            this.BotNPWaf = new Long(source.BotNPWaf);
        }
        if (source.IsBotTrial != null) {
            this.IsBotTrial = new Long(source.IsBotTrial);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceIds", this.ResourceIds);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "InquireNum", this.InquireNum);
        this.setParamSimple(map, prefix + "UsedNum", this.UsedNum);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "BotCPWaf", this.BotCPWaf);
        this.setParamSimple(map, prefix + "BotNPWaf", this.BotNPWaf);
        this.setParamSimple(map, prefix + "IsBotTrial", this.IsBotTrial);

    }
}

