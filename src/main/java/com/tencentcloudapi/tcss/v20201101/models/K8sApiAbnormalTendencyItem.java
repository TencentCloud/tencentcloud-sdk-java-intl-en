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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class K8sApiAbnormalTendencyItem extends AbstractModel {

    /**
    * <p>Date</p>
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * <p>Number of abnormal UA request events.</p>
    */
    @SerializedName("ExceptionUARequestCount")
    @Expose
    private Long ExceptionUARequestCount;

    /**
    * <p>Number of anonymous user permission events.</p>
    */
    @SerializedName("AnonymousUserRightCount")
    @Expose
    private Long AnonymousUserRightCount;

    /**
    * <p>Number of credential information acquisition events.</p>
    */
    @SerializedName("CredentialInformationObtainCount")
    @Expose
    private Long CredentialInformationObtainCount;

    /**
    * <p>Number of sensitive data mount events.</p>
    */
    @SerializedName("SensitiveDataMountCount")
    @Expose
    private Long SensitiveDataMountCount;

    /**
    * <p>Number of command execution events.</p>
    */
    @SerializedName("CmdExecCount")
    @Expose
    private Long CmdExecCount;

    /**
    * <p>Number of abnormal scheduled task events.</p>
    */
    @SerializedName("AbnormalScheduledTaskCount")
    @Expose
    private Long AbnormalScheduledTaskCount;

    /**
    * <p>Number of static Pod creations.</p>
    */
    @SerializedName("StaticsPodCreateCount")
    @Expose
    private Long StaticsPodCreateCount;

    /**
    * <p>Number of suspicious container creations.</p>
    */
    @SerializedName("DoubtfulContainerCreateCount")
    @Expose
    private Long DoubtfulContainerCreateCount;

    /**
    * <p>Number of custom rule events.</p>
    */
    @SerializedName("UserDefinedRuleCount")
    @Expose
    private Long UserDefinedRuleCount;

    /**
    * <p>Number of anonymous access events.</p>
    */
    @SerializedName("AnonymousAccessCount")
    @Expose
    private Long AnonymousAccessCount;

    /**
    * <p>Number of privileged container events.</p>
    */
    @SerializedName("PrivilegeContainerCount")
    @Expose
    private Long PrivilegeContainerCount;

    /**
    * <p>Number of alarms corresponding to the rule type.</p>
    */
    @SerializedName("RuleTypeCountSet")
    @Expose
    private K8SAPIRuleTypeCountItem [] RuleTypeCountSet;

    /**
     * Get <p>Date</p> 
     * @return Date <p>Date</p>
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set <p>Date</p>
     * @param Date <p>Date</p>
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get <p>Number of abnormal UA request events.</p> 
     * @return ExceptionUARequestCount <p>Number of abnormal UA request events.</p>
     */
    public Long getExceptionUARequestCount() {
        return this.ExceptionUARequestCount;
    }

    /**
     * Set <p>Number of abnormal UA request events.</p>
     * @param ExceptionUARequestCount <p>Number of abnormal UA request events.</p>
     */
    public void setExceptionUARequestCount(Long ExceptionUARequestCount) {
        this.ExceptionUARequestCount = ExceptionUARequestCount;
    }

    /**
     * Get <p>Number of anonymous user permission events.</p> 
     * @return AnonymousUserRightCount <p>Number of anonymous user permission events.</p>
     */
    public Long getAnonymousUserRightCount() {
        return this.AnonymousUserRightCount;
    }

    /**
     * Set <p>Number of anonymous user permission events.</p>
     * @param AnonymousUserRightCount <p>Number of anonymous user permission events.</p>
     */
    public void setAnonymousUserRightCount(Long AnonymousUserRightCount) {
        this.AnonymousUserRightCount = AnonymousUserRightCount;
    }

    /**
     * Get <p>Number of credential information acquisition events.</p> 
     * @return CredentialInformationObtainCount <p>Number of credential information acquisition events.</p>
     */
    public Long getCredentialInformationObtainCount() {
        return this.CredentialInformationObtainCount;
    }

    /**
     * Set <p>Number of credential information acquisition events.</p>
     * @param CredentialInformationObtainCount <p>Number of credential information acquisition events.</p>
     */
    public void setCredentialInformationObtainCount(Long CredentialInformationObtainCount) {
        this.CredentialInformationObtainCount = CredentialInformationObtainCount;
    }

    /**
     * Get <p>Number of sensitive data mount events.</p> 
     * @return SensitiveDataMountCount <p>Number of sensitive data mount events.</p>
     */
    public Long getSensitiveDataMountCount() {
        return this.SensitiveDataMountCount;
    }

    /**
     * Set <p>Number of sensitive data mount events.</p>
     * @param SensitiveDataMountCount <p>Number of sensitive data mount events.</p>
     */
    public void setSensitiveDataMountCount(Long SensitiveDataMountCount) {
        this.SensitiveDataMountCount = SensitiveDataMountCount;
    }

    /**
     * Get <p>Number of command execution events.</p> 
     * @return CmdExecCount <p>Number of command execution events.</p>
     */
    public Long getCmdExecCount() {
        return this.CmdExecCount;
    }

    /**
     * Set <p>Number of command execution events.</p>
     * @param CmdExecCount <p>Number of command execution events.</p>
     */
    public void setCmdExecCount(Long CmdExecCount) {
        this.CmdExecCount = CmdExecCount;
    }

    /**
     * Get <p>Number of abnormal scheduled task events.</p> 
     * @return AbnormalScheduledTaskCount <p>Number of abnormal scheduled task events.</p>
     */
    public Long getAbnormalScheduledTaskCount() {
        return this.AbnormalScheduledTaskCount;
    }

    /**
     * Set <p>Number of abnormal scheduled task events.</p>
     * @param AbnormalScheduledTaskCount <p>Number of abnormal scheduled task events.</p>
     */
    public void setAbnormalScheduledTaskCount(Long AbnormalScheduledTaskCount) {
        this.AbnormalScheduledTaskCount = AbnormalScheduledTaskCount;
    }

    /**
     * Get <p>Number of static Pod creations.</p> 
     * @return StaticsPodCreateCount <p>Number of static Pod creations.</p>
     */
    public Long getStaticsPodCreateCount() {
        return this.StaticsPodCreateCount;
    }

    /**
     * Set <p>Number of static Pod creations.</p>
     * @param StaticsPodCreateCount <p>Number of static Pod creations.</p>
     */
    public void setStaticsPodCreateCount(Long StaticsPodCreateCount) {
        this.StaticsPodCreateCount = StaticsPodCreateCount;
    }

    /**
     * Get <p>Number of suspicious container creations.</p> 
     * @return DoubtfulContainerCreateCount <p>Number of suspicious container creations.</p>
     */
    public Long getDoubtfulContainerCreateCount() {
        return this.DoubtfulContainerCreateCount;
    }

    /**
     * Set <p>Number of suspicious container creations.</p>
     * @param DoubtfulContainerCreateCount <p>Number of suspicious container creations.</p>
     */
    public void setDoubtfulContainerCreateCount(Long DoubtfulContainerCreateCount) {
        this.DoubtfulContainerCreateCount = DoubtfulContainerCreateCount;
    }

    /**
     * Get <p>Number of custom rule events.</p> 
     * @return UserDefinedRuleCount <p>Number of custom rule events.</p>
     */
    public Long getUserDefinedRuleCount() {
        return this.UserDefinedRuleCount;
    }

    /**
     * Set <p>Number of custom rule events.</p>
     * @param UserDefinedRuleCount <p>Number of custom rule events.</p>
     */
    public void setUserDefinedRuleCount(Long UserDefinedRuleCount) {
        this.UserDefinedRuleCount = UserDefinedRuleCount;
    }

    /**
     * Get <p>Number of anonymous access events.</p> 
     * @return AnonymousAccessCount <p>Number of anonymous access events.</p>
     */
    public Long getAnonymousAccessCount() {
        return this.AnonymousAccessCount;
    }

    /**
     * Set <p>Number of anonymous access events.</p>
     * @param AnonymousAccessCount <p>Number of anonymous access events.</p>
     */
    public void setAnonymousAccessCount(Long AnonymousAccessCount) {
        this.AnonymousAccessCount = AnonymousAccessCount;
    }

    /**
     * Get <p>Number of privileged container events.</p> 
     * @return PrivilegeContainerCount <p>Number of privileged container events.</p>
     */
    public Long getPrivilegeContainerCount() {
        return this.PrivilegeContainerCount;
    }

    /**
     * Set <p>Number of privileged container events.</p>
     * @param PrivilegeContainerCount <p>Number of privileged container events.</p>
     */
    public void setPrivilegeContainerCount(Long PrivilegeContainerCount) {
        this.PrivilegeContainerCount = PrivilegeContainerCount;
    }

    /**
     * Get <p>Number of alarms corresponding to the rule type.</p> 
     * @return RuleTypeCountSet <p>Number of alarms corresponding to the rule type.</p>
     */
    public K8SAPIRuleTypeCountItem [] getRuleTypeCountSet() {
        return this.RuleTypeCountSet;
    }

    /**
     * Set <p>Number of alarms corresponding to the rule type.</p>
     * @param RuleTypeCountSet <p>Number of alarms corresponding to the rule type.</p>
     */
    public void setRuleTypeCountSet(K8SAPIRuleTypeCountItem [] RuleTypeCountSet) {
        this.RuleTypeCountSet = RuleTypeCountSet;
    }

    public K8sApiAbnormalTendencyItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public K8sApiAbnormalTendencyItem(K8sApiAbnormalTendencyItem source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.ExceptionUARequestCount != null) {
            this.ExceptionUARequestCount = new Long(source.ExceptionUARequestCount);
        }
        if (source.AnonymousUserRightCount != null) {
            this.AnonymousUserRightCount = new Long(source.AnonymousUserRightCount);
        }
        if (source.CredentialInformationObtainCount != null) {
            this.CredentialInformationObtainCount = new Long(source.CredentialInformationObtainCount);
        }
        if (source.SensitiveDataMountCount != null) {
            this.SensitiveDataMountCount = new Long(source.SensitiveDataMountCount);
        }
        if (source.CmdExecCount != null) {
            this.CmdExecCount = new Long(source.CmdExecCount);
        }
        if (source.AbnormalScheduledTaskCount != null) {
            this.AbnormalScheduledTaskCount = new Long(source.AbnormalScheduledTaskCount);
        }
        if (source.StaticsPodCreateCount != null) {
            this.StaticsPodCreateCount = new Long(source.StaticsPodCreateCount);
        }
        if (source.DoubtfulContainerCreateCount != null) {
            this.DoubtfulContainerCreateCount = new Long(source.DoubtfulContainerCreateCount);
        }
        if (source.UserDefinedRuleCount != null) {
            this.UserDefinedRuleCount = new Long(source.UserDefinedRuleCount);
        }
        if (source.AnonymousAccessCount != null) {
            this.AnonymousAccessCount = new Long(source.AnonymousAccessCount);
        }
        if (source.PrivilegeContainerCount != null) {
            this.PrivilegeContainerCount = new Long(source.PrivilegeContainerCount);
        }
        if (source.RuleTypeCountSet != null) {
            this.RuleTypeCountSet = new K8SAPIRuleTypeCountItem[source.RuleTypeCountSet.length];
            for (int i = 0; i < source.RuleTypeCountSet.length; i++) {
                this.RuleTypeCountSet[i] = new K8SAPIRuleTypeCountItem(source.RuleTypeCountSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "ExceptionUARequestCount", this.ExceptionUARequestCount);
        this.setParamSimple(map, prefix + "AnonymousUserRightCount", this.AnonymousUserRightCount);
        this.setParamSimple(map, prefix + "CredentialInformationObtainCount", this.CredentialInformationObtainCount);
        this.setParamSimple(map, prefix + "SensitiveDataMountCount", this.SensitiveDataMountCount);
        this.setParamSimple(map, prefix + "CmdExecCount", this.CmdExecCount);
        this.setParamSimple(map, prefix + "AbnormalScheduledTaskCount", this.AbnormalScheduledTaskCount);
        this.setParamSimple(map, prefix + "StaticsPodCreateCount", this.StaticsPodCreateCount);
        this.setParamSimple(map, prefix + "DoubtfulContainerCreateCount", this.DoubtfulContainerCreateCount);
        this.setParamSimple(map, prefix + "UserDefinedRuleCount", this.UserDefinedRuleCount);
        this.setParamSimple(map, prefix + "AnonymousAccessCount", this.AnonymousAccessCount);
        this.setParamSimple(map, prefix + "PrivilegeContainerCount", this.PrivilegeContainerCount);
        this.setParamArrayObj(map, prefix + "RuleTypeCountSet.", this.RuleTypeCountSet);

    }
}

