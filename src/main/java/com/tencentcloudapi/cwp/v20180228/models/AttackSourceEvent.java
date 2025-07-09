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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttackSourceEvent extends AbstractModel {

    /**
    * Event type. 0: virus scanning; 1: abnormal log-in; 2: password cracking; 3: malicious request; 4: high-risk command.
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
    * [Virus scanning] Virus name: VirusName, file name: FileName, file path: FilePath, file size: FileSize, file MD5: MD5, first detection time: CreateTime, last detection time: LatestScanTime, severity description: HarmDescribe, fixing suggestion: SuggestScheme
[Abnormal log-in] Source IP: SrcIp, location: Location, log-in username: UserName, log-in time: LoginTime
[Password cracking] Source IP: SrcIp, location: City and Country, protocol: Protocol, log-in username: UserName, port: Port, attempt count: Count, first attack time: CreateTime, last attack time: ModifyTime
[Malicious request] Malicious request domain name: Url, process: ProcessName, MD5: ProcessMd5, PID: Pid, request count: AccessCount, last request time: MergeTime, severity description: HarmDescribe, fixing suggestion: SuggestScheme
[High-risk command] Hit rule name: RuleName, rule category: RuleCategory, command content: BashCmd, data source: DetectBy, Log-in user: User, PID: Pid, occurrence time: CreateTime, severity description: HarmDescribe, fixing suggestion: SuggestScheme
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Intrusion time
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Unified event risk level. 0: prompt; 1: low; 2: medium; 3: high; 4: critical.
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Risk level string in Chinese
    */
    @SerializedName("LevelZh")
    @Expose
    private String LevelZh;

    /**
    * Event ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Host UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
     * Get Event type. 0: virus scanning; 1: abnormal log-in; 2: password cracking; 3: malicious request; 4: high-risk command. 
     * @return EventType Event type. 0: virus scanning; 1: abnormal log-in; 2: password cracking; 3: malicious request; 4: high-risk command.
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set Event type. 0: virus scanning; 1: abnormal log-in; 2: password cracking; 3: malicious request; 4: high-risk command.
     * @param EventType Event type. 0: virus scanning; 1: abnormal log-in; 2: password cracking; 3: malicious request; 4: high-risk command.
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    /**
     * Get [Virus scanning] Virus name: VirusName, file name: FileName, file path: FilePath, file size: FileSize, file MD5: MD5, first detection time: CreateTime, last detection time: LatestScanTime, severity description: HarmDescribe, fixing suggestion: SuggestScheme
[Abnormal log-in] Source IP: SrcIp, location: Location, log-in username: UserName, log-in time: LoginTime
[Password cracking] Source IP: SrcIp, location: City and Country, protocol: Protocol, log-in username: UserName, port: Port, attempt count: Count, first attack time: CreateTime, last attack time: ModifyTime
[Malicious request] Malicious request domain name: Url, process: ProcessName, MD5: ProcessMd5, PID: Pid, request count: AccessCount, last request time: MergeTime, severity description: HarmDescribe, fixing suggestion: SuggestScheme
[High-risk command] Hit rule name: RuleName, rule category: RuleCategory, command content: BashCmd, data source: DetectBy, Log-in user: User, PID: Pid, occurrence time: CreateTime, severity description: HarmDescribe, fixing suggestion: SuggestScheme 
     * @return Content [Virus scanning] Virus name: VirusName, file name: FileName, file path: FilePath, file size: FileSize, file MD5: MD5, first detection time: CreateTime, last detection time: LatestScanTime, severity description: HarmDescribe, fixing suggestion: SuggestScheme
[Abnormal log-in] Source IP: SrcIp, location: Location, log-in username: UserName, log-in time: LoginTime
[Password cracking] Source IP: SrcIp, location: City and Country, protocol: Protocol, log-in username: UserName, port: Port, attempt count: Count, first attack time: CreateTime, last attack time: ModifyTime
[Malicious request] Malicious request domain name: Url, process: ProcessName, MD5: ProcessMd5, PID: Pid, request count: AccessCount, last request time: MergeTime, severity description: HarmDescribe, fixing suggestion: SuggestScheme
[High-risk command] Hit rule name: RuleName, rule category: RuleCategory, command content: BashCmd, data source: DetectBy, Log-in user: User, PID: Pid, occurrence time: CreateTime, severity description: HarmDescribe, fixing suggestion: SuggestScheme
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set [Virus scanning] Virus name: VirusName, file name: FileName, file path: FilePath, file size: FileSize, file MD5: MD5, first detection time: CreateTime, last detection time: LatestScanTime, severity description: HarmDescribe, fixing suggestion: SuggestScheme
[Abnormal log-in] Source IP: SrcIp, location: Location, log-in username: UserName, log-in time: LoginTime
[Password cracking] Source IP: SrcIp, location: City and Country, protocol: Protocol, log-in username: UserName, port: Port, attempt count: Count, first attack time: CreateTime, last attack time: ModifyTime
[Malicious request] Malicious request domain name: Url, process: ProcessName, MD5: ProcessMd5, PID: Pid, request count: AccessCount, last request time: MergeTime, severity description: HarmDescribe, fixing suggestion: SuggestScheme
[High-risk command] Hit rule name: RuleName, rule category: RuleCategory, command content: BashCmd, data source: DetectBy, Log-in user: User, PID: Pid, occurrence time: CreateTime, severity description: HarmDescribe, fixing suggestion: SuggestScheme
     * @param Content [Virus scanning] Virus name: VirusName, file name: FileName, file path: FilePath, file size: FileSize, file MD5: MD5, first detection time: CreateTime, last detection time: LatestScanTime, severity description: HarmDescribe, fixing suggestion: SuggestScheme
[Abnormal log-in] Source IP: SrcIp, location: Location, log-in username: UserName, log-in time: LoginTime
[Password cracking] Source IP: SrcIp, location: City and Country, protocol: Protocol, log-in username: UserName, port: Port, attempt count: Count, first attack time: CreateTime, last attack time: ModifyTime
[Malicious request] Malicious request domain name: Url, process: ProcessName, MD5: ProcessMd5, PID: Pid, request count: AccessCount, last request time: MergeTime, severity description: HarmDescribe, fixing suggestion: SuggestScheme
[High-risk command] Hit rule name: RuleName, rule category: RuleCategory, command content: BashCmd, data source: DetectBy, Log-in user: User, PID: Pid, occurrence time: CreateTime, severity description: HarmDescribe, fixing suggestion: SuggestScheme
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Intrusion time 
     * @return CreatedTime Intrusion time
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Intrusion time
     * @param CreatedTime Intrusion time
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Unified event risk level. 0: prompt; 1: low; 2: medium; 3: high; 4: critical. 
     * @return Level Unified event risk level. 0: prompt; 1: low; 2: medium; 3: high; 4: critical.
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Unified event risk level. 0: prompt; 1: low; 2: medium; 3: high; 4: critical.
     * @param Level Unified event risk level. 0: prompt; 1: low; 2: medium; 3: high; 4: critical.
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Risk level string in Chinese 
     * @return LevelZh Risk level string in Chinese
     */
    public String getLevelZh() {
        return this.LevelZh;
    }

    /**
     * Set Risk level string in Chinese
     * @param LevelZh Risk level string in Chinese
     */
    public void setLevelZh(String LevelZh) {
        this.LevelZh = LevelZh;
    }

    /**
     * Get Event ID 
     * @return Id Event ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Event ID
     * @param Id Event ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Host UUID 
     * @return Uuid Host UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Host UUID
     * @param Uuid Host UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    public AttackSourceEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttackSourceEvent(AttackSourceEvent source) {
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.LevelZh != null) {
            this.LevelZh = new String(source.LevelZh);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "LevelZh", this.LevelZh);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);

    }
}

