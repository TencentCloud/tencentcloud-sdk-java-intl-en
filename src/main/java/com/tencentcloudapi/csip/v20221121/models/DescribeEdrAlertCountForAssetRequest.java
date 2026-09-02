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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEdrAlertCountForAssetRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>List of host instance_id. If empty, return summarize for the appid corresponding to MemberId within range. If not empty, return statistics by each instance_id granularity.</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>Filter criteria list, consistent with DescribeEdrAlertList. Supported Name Values and corresponding Values enumeration: Status - string - Required: No - Alarm Status. Values: PENDING, WHITELISTED, PROCESSED, IGNORED. Level - string - Required: No - Alarm Level. Values: CRITICAL, HIGH, MEDIUM, LOW, INFO. DetectMode - string - Required: No - Detection mode. Values: PRECISE, BALANCED, DEEP. AlertCategory - string - Required: No - Major category of alarm. Values: VIRUS_TROJAN, ABNORMAL_LOGIN, HOST_BEHAVIOR, NETWORK_BEHAVIOR, AI_LINK_ENGINE. AlertSubType - string - Required: No - Alarm sub-type. Values: MALWARE_FILE, MALWARE_PROCESS, RISK_LOGIN, BRUTE_FORCE, DNS, BASH, PRIV_ESCALATION, REVERSE_SHELL, NET_ATTACK, VUL_DEFENCE, MEMORY_SHELL_INJECT, MEMORY_SHELL_SCAN, MULTI_BEHAVIOR_ATTACK. AttackStage - string - Required: No - ATT&CK ATTACK stage. Values: TA0001-TA0011, TA0040, TA0042, TA0043. Empty string means unclassified. AlertSource - string - Required: No - Alarm source. Values: HOST. StartTime - string - Required: No - Start time in YYYY-MM-DD HH:MM:SS format. Defaults to the last 180 days if not passed. EndTime - string - Required: No - End time in YYYY-MM-DD HH:MM:SS format. Defaults to the current time if not passed.</p>
    */
    @SerializedName("Filters")
    @Expose
    private EDRFilters [] Filters;

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>List of host instance_id. If empty, return summarize for the appid corresponding to MemberId within range. If not empty, return statistics by each instance_id granularity.</p> 
     * @return InstanceIds <p>List of host instance_id. If empty, return summarize for the appid corresponding to MemberId within range. If not empty, return statistics by each instance_id granularity.</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>List of host instance_id. If empty, return summarize for the appid corresponding to MemberId within range. If not empty, return statistics by each instance_id granularity.</p>
     * @param InstanceIds <p>List of host instance_id. If empty, return summarize for the appid corresponding to MemberId within range. If not empty, return statistics by each instance_id granularity.</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>Filter criteria list, consistent with DescribeEdrAlertList. Supported Name Values and corresponding Values enumeration: Status - string - Required: No - Alarm Status. Values: PENDING, WHITELISTED, PROCESSED, IGNORED. Level - string - Required: No - Alarm Level. Values: CRITICAL, HIGH, MEDIUM, LOW, INFO. DetectMode - string - Required: No - Detection mode. Values: PRECISE, BALANCED, DEEP. AlertCategory - string - Required: No - Major category of alarm. Values: VIRUS_TROJAN, ABNORMAL_LOGIN, HOST_BEHAVIOR, NETWORK_BEHAVIOR, AI_LINK_ENGINE. AlertSubType - string - Required: No - Alarm sub-type. Values: MALWARE_FILE, MALWARE_PROCESS, RISK_LOGIN, BRUTE_FORCE, DNS, BASH, PRIV_ESCALATION, REVERSE_SHELL, NET_ATTACK, VUL_DEFENCE, MEMORY_SHELL_INJECT, MEMORY_SHELL_SCAN, MULTI_BEHAVIOR_ATTACK. AttackStage - string - Required: No - ATT&CK ATTACK stage. Values: TA0001-TA0011, TA0040, TA0042, TA0043. Empty string means unclassified. AlertSource - string - Required: No - Alarm source. Values: HOST. StartTime - string - Required: No - Start time in YYYY-MM-DD HH:MM:SS format. Defaults to the last 180 days if not passed. EndTime - string - Required: No - End time in YYYY-MM-DD HH:MM:SS format. Defaults to the current time if not passed.</p> 
     * @return Filters <p>Filter criteria list, consistent with DescribeEdrAlertList. Supported Name Values and corresponding Values enumeration: Status - string - Required: No - Alarm Status. Values: PENDING, WHITELISTED, PROCESSED, IGNORED. Level - string - Required: No - Alarm Level. Values: CRITICAL, HIGH, MEDIUM, LOW, INFO. DetectMode - string - Required: No - Detection mode. Values: PRECISE, BALANCED, DEEP. AlertCategory - string - Required: No - Major category of alarm. Values: VIRUS_TROJAN, ABNORMAL_LOGIN, HOST_BEHAVIOR, NETWORK_BEHAVIOR, AI_LINK_ENGINE. AlertSubType - string - Required: No - Alarm sub-type. Values: MALWARE_FILE, MALWARE_PROCESS, RISK_LOGIN, BRUTE_FORCE, DNS, BASH, PRIV_ESCALATION, REVERSE_SHELL, NET_ATTACK, VUL_DEFENCE, MEMORY_SHELL_INJECT, MEMORY_SHELL_SCAN, MULTI_BEHAVIOR_ATTACK. AttackStage - string - Required: No - ATT&CK ATTACK stage. Values: TA0001-TA0011, TA0040, TA0042, TA0043. Empty string means unclassified. AlertSource - string - Required: No - Alarm source. Values: HOST. StartTime - string - Required: No - Start time in YYYY-MM-DD HH:MM:SS format. Defaults to the last 180 days if not passed. EndTime - string - Required: No - End time in YYYY-MM-DD HH:MM:SS format. Defaults to the current time if not passed.</p>
     */
    public EDRFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter criteria list, consistent with DescribeEdrAlertList. Supported Name Values and corresponding Values enumeration: Status - string - Required: No - Alarm Status. Values: PENDING, WHITELISTED, PROCESSED, IGNORED. Level - string - Required: No - Alarm Level. Values: CRITICAL, HIGH, MEDIUM, LOW, INFO. DetectMode - string - Required: No - Detection mode. Values: PRECISE, BALANCED, DEEP. AlertCategory - string - Required: No - Major category of alarm. Values: VIRUS_TROJAN, ABNORMAL_LOGIN, HOST_BEHAVIOR, NETWORK_BEHAVIOR, AI_LINK_ENGINE. AlertSubType - string - Required: No - Alarm sub-type. Values: MALWARE_FILE, MALWARE_PROCESS, RISK_LOGIN, BRUTE_FORCE, DNS, BASH, PRIV_ESCALATION, REVERSE_SHELL, NET_ATTACK, VUL_DEFENCE, MEMORY_SHELL_INJECT, MEMORY_SHELL_SCAN, MULTI_BEHAVIOR_ATTACK. AttackStage - string - Required: No - ATT&CK ATTACK stage. Values: TA0001-TA0011, TA0040, TA0042, TA0043. Empty string means unclassified. AlertSource - string - Required: No - Alarm source. Values: HOST. StartTime - string - Required: No - Start time in YYYY-MM-DD HH:MM:SS format. Defaults to the last 180 days if not passed. EndTime - string - Required: No - End time in YYYY-MM-DD HH:MM:SS format. Defaults to the current time if not passed.</p>
     * @param Filters <p>Filter criteria list, consistent with DescribeEdrAlertList. Supported Name Values and corresponding Values enumeration: Status - string - Required: No - Alarm Status. Values: PENDING, WHITELISTED, PROCESSED, IGNORED. Level - string - Required: No - Alarm Level. Values: CRITICAL, HIGH, MEDIUM, LOW, INFO. DetectMode - string - Required: No - Detection mode. Values: PRECISE, BALANCED, DEEP. AlertCategory - string - Required: No - Major category of alarm. Values: VIRUS_TROJAN, ABNORMAL_LOGIN, HOST_BEHAVIOR, NETWORK_BEHAVIOR, AI_LINK_ENGINE. AlertSubType - string - Required: No - Alarm sub-type. Values: MALWARE_FILE, MALWARE_PROCESS, RISK_LOGIN, BRUTE_FORCE, DNS, BASH, PRIV_ESCALATION, REVERSE_SHELL, NET_ATTACK, VUL_DEFENCE, MEMORY_SHELL_INJECT, MEMORY_SHELL_SCAN, MULTI_BEHAVIOR_ATTACK. AttackStage - string - Required: No - ATT&CK ATTACK stage. Values: TA0001-TA0011, TA0040, TA0042, TA0043. Empty string means unclassified. AlertSource - string - Required: No - Alarm source. Values: HOST. StartTime - string - Required: No - Start time in YYYY-MM-DD HH:MM:SS format. Defaults to the last 180 days if not passed. EndTime - string - Required: No - End time in YYYY-MM-DD HH:MM:SS format. Defaults to the current time if not passed.</p>
     */
    public void setFilters(EDRFilters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeEdrAlertCountForAssetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdrAlertCountForAssetRequest(DescribeEdrAlertCountForAssetRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new EDRFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new EDRFilters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

