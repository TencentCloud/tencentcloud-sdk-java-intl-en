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

public class CreateIpAccessControlRequest extends AbstractModel {

    /**
    * Specific domain name, for example, test.qcloudwaf.com.
Global domain name, that is, global.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * IP parameter list.
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
    * 42: blocklist; 40: allowlist.
    */
    @SerializedName("ActionType")
    @Expose
    private Long ActionType;

    /**
    * valid_ts indicates a valid date. Its value is a second-level timestamp, such as 1680570420, which indicates 2023-04-04 09:07:00.
    */
    @SerializedName("ValidTS")
    @Expose
    private Long ValidTS;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * WAF instance type: sparta-waf for SaaS WAF, clb-waf for CLB WAF.
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * Valid values: batch (adding in batches), bot (adding to the bot details list in bot traffic analysis), cc (adding to IP addresses of the CC attack type in the attack log list), custom (default value for adding not in batches).
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * Remarks
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * Scheduled configuration type.
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * Details of scheduled configuration.
    */
    @SerializedName("JobDateTime")
    @Expose
    private JobDateTime JobDateTime;

    /**
     * Get Specific domain name, for example, test.qcloudwaf.com.
Global domain name, that is, global. 
     * @return Domain Specific domain name, for example, test.qcloudwaf.com.
Global domain name, that is, global.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Specific domain name, for example, test.qcloudwaf.com.
Global domain name, that is, global.
     * @param Domain Specific domain name, for example, test.qcloudwaf.com.
Global domain name, that is, global.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get IP parameter list. 
     * @return IpList IP parameter list.
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set IP parameter list.
     * @param IpList IP parameter list.
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    /**
     * Get 42: blocklist; 40: allowlist. 
     * @return ActionType 42: blocklist; 40: allowlist.
     */
    public Long getActionType() {
        return this.ActionType;
    }

    /**
     * Set 42: blocklist; 40: allowlist.
     * @param ActionType 42: blocklist; 40: allowlist.
     */
    public void setActionType(Long ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get valid_ts indicates a valid date. Its value is a second-level timestamp, such as 1680570420, which indicates 2023-04-04 09:07:00. 
     * @return ValidTS valid_ts indicates a valid date. Its value is a second-level timestamp, such as 1680570420, which indicates 2023-04-04 09:07:00.
     * @deprecated
     */
    @Deprecated
    public Long getValidTS() {
        return this.ValidTS;
    }

    /**
     * Set valid_ts indicates a valid date. Its value is a second-level timestamp, such as 1680570420, which indicates 2023-04-04 09:07:00.
     * @param ValidTS valid_ts indicates a valid date. Its value is a second-level timestamp, such as 1680570420, which indicates 2023-04-04 09:07:00.
     * @deprecated
     */
    @Deprecated
    public void setValidTS(Long ValidTS) {
        this.ValidTS = ValidTS;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get WAF instance type: sparta-waf for SaaS WAF, clb-waf for CLB WAF. 
     * @return Edition WAF instance type: sparta-waf for SaaS WAF, clb-waf for CLB WAF.
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set WAF instance type: sparta-waf for SaaS WAF, clb-waf for CLB WAF.
     * @param Edition WAF instance type: sparta-waf for SaaS WAF, clb-waf for CLB WAF.
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get Valid values: batch (adding in batches), bot (adding to the bot details list in bot traffic analysis), cc (adding to IP addresses of the CC attack type in the attack log list), custom (default value for adding not in batches). 
     * @return SourceType Valid values: batch (adding in batches), bot (adding to the bot details list in bot traffic analysis), cc (adding to IP addresses of the CC attack type in the attack log list), custom (default value for adding not in batches).
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Valid values: batch (adding in batches), bot (adding to the bot details list in bot traffic analysis), cc (adding to IP addresses of the CC attack type in the attack log list), custom (default value for adding not in batches).
     * @param SourceType Valid values: batch (adding in batches), bot (adding to the bot details list in bot traffic analysis), cc (adding to IP addresses of the CC attack type in the attack log list), custom (default value for adding not in batches).
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Remarks 
     * @return Note Remarks
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set Remarks
     * @param Note Remarks
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get Scheduled configuration type. 
     * @return JobType Scheduled configuration type.
     */
    public String getJobType() {
        return this.JobType;
    }

    /**
     * Set Scheduled configuration type.
     * @param JobType Scheduled configuration type.
     */
    public void setJobType(String JobType) {
        this.JobType = JobType;
    }

    /**
     * Get Details of scheduled configuration. 
     * @return JobDateTime Details of scheduled configuration.
     */
    public JobDateTime getJobDateTime() {
        return this.JobDateTime;
    }

    /**
     * Set Details of scheduled configuration.
     * @param JobDateTime Details of scheduled configuration.
     */
    public void setJobDateTime(JobDateTime JobDateTime) {
        this.JobDateTime = JobDateTime;
    }

    public CreateIpAccessControlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIpAccessControlRequest(CreateIpAccessControlRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.IpList != null) {
            this.IpList = new String[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new String(source.IpList[i]);
            }
        }
        if (source.ActionType != null) {
            this.ActionType = new Long(source.ActionType);
        }
        if (source.ValidTS != null) {
            this.ValidTS = new Long(source.ValidTS);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.JobDateTime != null) {
            this.JobDateTime = new JobDateTime(source.JobDateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ValidTS", this.ValidTS);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamObj(map, prefix + "JobDateTime.", this.JobDateTime);

    }
}

