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
    * Date
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * The number of abnormal UA request events
    */
    @SerializedName("ExceptionUARequestCount")
    @Expose
    private Long ExceptionUARequestCount;

    /**
    * The number of anonymous user permission events
    */
    @SerializedName("AnonymousUserRightCount")
    @Expose
    private Long AnonymousUserRightCount;

    /**
    * The number of credential information acquisition events
    */
    @SerializedName("CredentialInformationObtainCount")
    @Expose
    private Long CredentialInformationObtainCount;

    /**
    * The number of sensitive data mounting events
    */
    @SerializedName("SensitiveDataMountCount")
    @Expose
    private Long SensitiveDataMountCount;

    /**
    * The number of command execution events
    */
    @SerializedName("CmdExecCount")
    @Expose
    private Long CmdExecCount;

    /**
    * The number of abnormal scheduled task events
    */
    @SerializedName("AbnormalScheduledTaskCount")
    @Expose
    private Long AbnormalScheduledTaskCount;

    /**
    * The number of static pods created
    */
    @SerializedName("StaticsPodCreateCount")
    @Expose
    private Long StaticsPodCreateCount;

    /**
    * The number of suspicious containers created
    */
    @SerializedName("DoubtfulContainerCreateCount")
    @Expose
    private Long DoubtfulContainerCreateCount;

    /**
    * The number of custom rule events
    */
    @SerializedName("UserDefinedRuleCount")
    @Expose
    private Long UserDefinedRuleCount;

    /**
    * The number of anonymous access events
    */
    @SerializedName("AnonymousAccessCount")
    @Expose
    private Long AnonymousAccessCount;

    /**
    * The number of privilege container events
    */
    @SerializedName("PrivilegeContainerCount")
    @Expose
    private Long PrivilegeContainerCount;

    /**
     * Get Date 
     * @return Date Date
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Date
     * @param Date Date
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get The number of abnormal UA request events 
     * @return ExceptionUARequestCount The number of abnormal UA request events
     */
    public Long getExceptionUARequestCount() {
        return this.ExceptionUARequestCount;
    }

    /**
     * Set The number of abnormal UA request events
     * @param ExceptionUARequestCount The number of abnormal UA request events
     */
    public void setExceptionUARequestCount(Long ExceptionUARequestCount) {
        this.ExceptionUARequestCount = ExceptionUARequestCount;
    }

    /**
     * Get The number of anonymous user permission events 
     * @return AnonymousUserRightCount The number of anonymous user permission events
     */
    public Long getAnonymousUserRightCount() {
        return this.AnonymousUserRightCount;
    }

    /**
     * Set The number of anonymous user permission events
     * @param AnonymousUserRightCount The number of anonymous user permission events
     */
    public void setAnonymousUserRightCount(Long AnonymousUserRightCount) {
        this.AnonymousUserRightCount = AnonymousUserRightCount;
    }

    /**
     * Get The number of credential information acquisition events 
     * @return CredentialInformationObtainCount The number of credential information acquisition events
     */
    public Long getCredentialInformationObtainCount() {
        return this.CredentialInformationObtainCount;
    }

    /**
     * Set The number of credential information acquisition events
     * @param CredentialInformationObtainCount The number of credential information acquisition events
     */
    public void setCredentialInformationObtainCount(Long CredentialInformationObtainCount) {
        this.CredentialInformationObtainCount = CredentialInformationObtainCount;
    }

    /**
     * Get The number of sensitive data mounting events 
     * @return SensitiveDataMountCount The number of sensitive data mounting events
     */
    public Long getSensitiveDataMountCount() {
        return this.SensitiveDataMountCount;
    }

    /**
     * Set The number of sensitive data mounting events
     * @param SensitiveDataMountCount The number of sensitive data mounting events
     */
    public void setSensitiveDataMountCount(Long SensitiveDataMountCount) {
        this.SensitiveDataMountCount = SensitiveDataMountCount;
    }

    /**
     * Get The number of command execution events 
     * @return CmdExecCount The number of command execution events
     */
    public Long getCmdExecCount() {
        return this.CmdExecCount;
    }

    /**
     * Set The number of command execution events
     * @param CmdExecCount The number of command execution events
     */
    public void setCmdExecCount(Long CmdExecCount) {
        this.CmdExecCount = CmdExecCount;
    }

    /**
     * Get The number of abnormal scheduled task events 
     * @return AbnormalScheduledTaskCount The number of abnormal scheduled task events
     */
    public Long getAbnormalScheduledTaskCount() {
        return this.AbnormalScheduledTaskCount;
    }

    /**
     * Set The number of abnormal scheduled task events
     * @param AbnormalScheduledTaskCount The number of abnormal scheduled task events
     */
    public void setAbnormalScheduledTaskCount(Long AbnormalScheduledTaskCount) {
        this.AbnormalScheduledTaskCount = AbnormalScheduledTaskCount;
    }

    /**
     * Get The number of static pods created 
     * @return StaticsPodCreateCount The number of static pods created
     */
    public Long getStaticsPodCreateCount() {
        return this.StaticsPodCreateCount;
    }

    /**
     * Set The number of static pods created
     * @param StaticsPodCreateCount The number of static pods created
     */
    public void setStaticsPodCreateCount(Long StaticsPodCreateCount) {
        this.StaticsPodCreateCount = StaticsPodCreateCount;
    }

    /**
     * Get The number of suspicious containers created 
     * @return DoubtfulContainerCreateCount The number of suspicious containers created
     */
    public Long getDoubtfulContainerCreateCount() {
        return this.DoubtfulContainerCreateCount;
    }

    /**
     * Set The number of suspicious containers created
     * @param DoubtfulContainerCreateCount The number of suspicious containers created
     */
    public void setDoubtfulContainerCreateCount(Long DoubtfulContainerCreateCount) {
        this.DoubtfulContainerCreateCount = DoubtfulContainerCreateCount;
    }

    /**
     * Get The number of custom rule events 
     * @return UserDefinedRuleCount The number of custom rule events
     */
    public Long getUserDefinedRuleCount() {
        return this.UserDefinedRuleCount;
    }

    /**
     * Set The number of custom rule events
     * @param UserDefinedRuleCount The number of custom rule events
     */
    public void setUserDefinedRuleCount(Long UserDefinedRuleCount) {
        this.UserDefinedRuleCount = UserDefinedRuleCount;
    }

    /**
     * Get The number of anonymous access events 
     * @return AnonymousAccessCount The number of anonymous access events
     */
    public Long getAnonymousAccessCount() {
        return this.AnonymousAccessCount;
    }

    /**
     * Set The number of anonymous access events
     * @param AnonymousAccessCount The number of anonymous access events
     */
    public void setAnonymousAccessCount(Long AnonymousAccessCount) {
        this.AnonymousAccessCount = AnonymousAccessCount;
    }

    /**
     * Get The number of privilege container events 
     * @return PrivilegeContainerCount The number of privilege container events
     */
    public Long getPrivilegeContainerCount() {
        return this.PrivilegeContainerCount;
    }

    /**
     * Set The number of privilege container events
     * @param PrivilegeContainerCount The number of privilege container events
     */
    public void setPrivilegeContainerCount(Long PrivilegeContainerCount) {
        this.PrivilegeContainerCount = PrivilegeContainerCount;
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

    }
}

