/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAppRequest extends AbstractModel {

    /**
    * Application name
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Tencent Cloud project ID. Default value: 0, which means that the default project is used.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * List of engines to be supported.
Valid values: `android`, `ios`, `unity`, `cocos`, `unreal`, `windows`. All values are selected by default.
    */
    @SerializedName("EngineList")
    @Expose
    private String [] EngineList;

    /**
    * List of regions.
Valid values: `mainland` (Chinese mainland), `hmt` (Hong Kong, Macao and Taiwan (China)), `sea` (Southeast Asia), `na` (North America), `eu` (Europe), `jpkr` (Japan, Korea and Asia Pacific), `sa` (South America), `oc` (Oceania), `me` (Middle East). All values are selected by default.
    */
    @SerializedName("RegionList")
    @Expose
    private String [] RegionList;

    /**
    * Configuration information of Voice Chat
    */
    @SerializedName("RealtimeSpeechConf")
    @Expose
    private RealtimeSpeechConf RealtimeSpeechConf;

    /**
    * Configuration information of Voice Messaging
    */
    @SerializedName("VoiceMessageConf")
    @Expose
    private VoiceMessageConf VoiceMessageConf;

    /**
    * Configuration information of Voice Analysis Service
    */
    @SerializedName("VoiceFilterConf")
    @Expose
    private VoiceFilterConf VoiceFilterConf;

    /**
    * Configuration information of Speech-to-Text
    */
    @SerializedName("AsrConf")
    @Expose
    private AsrConf AsrConf;

    /**
    * List of tags to be added
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Application name 
     * @return AppName Application name
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Application name
     * @param AppName Application name
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Tencent Cloud project ID. Default value: 0, which means that the default project is used. 
     * @return ProjectId Tencent Cloud project ID. Default value: 0, which means that the default project is used.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Tencent Cloud project ID. Default value: 0, which means that the default project is used.
     * @param ProjectId Tencent Cloud project ID. Default value: 0, which means that the default project is used.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get List of engines to be supported.
Valid values: `android`, `ios`, `unity`, `cocos`, `unreal`, `windows`. All values are selected by default. 
     * @return EngineList List of engines to be supported.
Valid values: `android`, `ios`, `unity`, `cocos`, `unreal`, `windows`. All values are selected by default.
     */
    public String [] getEngineList() {
        return this.EngineList;
    }

    /**
     * Set List of engines to be supported.
Valid values: `android`, `ios`, `unity`, `cocos`, `unreal`, `windows`. All values are selected by default.
     * @param EngineList List of engines to be supported.
Valid values: `android`, `ios`, `unity`, `cocos`, `unreal`, `windows`. All values are selected by default.
     */
    public void setEngineList(String [] EngineList) {
        this.EngineList = EngineList;
    }

    /**
     * Get List of regions.
Valid values: `mainland` (Chinese mainland), `hmt` (Hong Kong, Macao and Taiwan (China)), `sea` (Southeast Asia), `na` (North America), `eu` (Europe), `jpkr` (Japan, Korea and Asia Pacific), `sa` (South America), `oc` (Oceania), `me` (Middle East). All values are selected by default. 
     * @return RegionList List of regions.
Valid values: `mainland` (Chinese mainland), `hmt` (Hong Kong, Macao and Taiwan (China)), `sea` (Southeast Asia), `na` (North America), `eu` (Europe), `jpkr` (Japan, Korea and Asia Pacific), `sa` (South America), `oc` (Oceania), `me` (Middle East). All values are selected by default.
     */
    public String [] getRegionList() {
        return this.RegionList;
    }

    /**
     * Set List of regions.
Valid values: `mainland` (Chinese mainland), `hmt` (Hong Kong, Macao and Taiwan (China)), `sea` (Southeast Asia), `na` (North America), `eu` (Europe), `jpkr` (Japan, Korea and Asia Pacific), `sa` (South America), `oc` (Oceania), `me` (Middle East). All values are selected by default.
     * @param RegionList List of regions.
Valid values: `mainland` (Chinese mainland), `hmt` (Hong Kong, Macao and Taiwan (China)), `sea` (Southeast Asia), `na` (North America), `eu` (Europe), `jpkr` (Japan, Korea and Asia Pacific), `sa` (South America), `oc` (Oceania), `me` (Middle East). All values are selected by default.
     */
    public void setRegionList(String [] RegionList) {
        this.RegionList = RegionList;
    }

    /**
     * Get Configuration information of Voice Chat 
     * @return RealtimeSpeechConf Configuration information of Voice Chat
     */
    public RealtimeSpeechConf getRealtimeSpeechConf() {
        return this.RealtimeSpeechConf;
    }

    /**
     * Set Configuration information of Voice Chat
     * @param RealtimeSpeechConf Configuration information of Voice Chat
     */
    public void setRealtimeSpeechConf(RealtimeSpeechConf RealtimeSpeechConf) {
        this.RealtimeSpeechConf = RealtimeSpeechConf;
    }

    /**
     * Get Configuration information of Voice Messaging 
     * @return VoiceMessageConf Configuration information of Voice Messaging
     */
    public VoiceMessageConf getVoiceMessageConf() {
        return this.VoiceMessageConf;
    }

    /**
     * Set Configuration information of Voice Messaging
     * @param VoiceMessageConf Configuration information of Voice Messaging
     */
    public void setVoiceMessageConf(VoiceMessageConf VoiceMessageConf) {
        this.VoiceMessageConf = VoiceMessageConf;
    }

    /**
     * Get Configuration information of Voice Analysis Service 
     * @return VoiceFilterConf Configuration information of Voice Analysis Service
     */
    public VoiceFilterConf getVoiceFilterConf() {
        return this.VoiceFilterConf;
    }

    /**
     * Set Configuration information of Voice Analysis Service
     * @param VoiceFilterConf Configuration information of Voice Analysis Service
     */
    public void setVoiceFilterConf(VoiceFilterConf VoiceFilterConf) {
        this.VoiceFilterConf = VoiceFilterConf;
    }

    /**
     * Get Configuration information of Speech-to-Text 
     * @return AsrConf Configuration information of Speech-to-Text
     */
    public AsrConf getAsrConf() {
        return this.AsrConf;
    }

    /**
     * Set Configuration information of Speech-to-Text
     * @param AsrConf Configuration information of Speech-to-Text
     */
    public void setAsrConf(AsrConf AsrConf) {
        this.AsrConf = AsrConf;
    }

    /**
     * Get List of tags to be added 
     * @return Tags List of tags to be added
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set List of tags to be added
     * @param Tags List of tags to be added
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAppRequest(CreateAppRequest source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.EngineList != null) {
            this.EngineList = new String[source.EngineList.length];
            for (int i = 0; i < source.EngineList.length; i++) {
                this.EngineList[i] = new String(source.EngineList[i]);
            }
        }
        if (source.RegionList != null) {
            this.RegionList = new String[source.RegionList.length];
            for (int i = 0; i < source.RegionList.length; i++) {
                this.RegionList[i] = new String(source.RegionList[i]);
            }
        }
        if (source.RealtimeSpeechConf != null) {
            this.RealtimeSpeechConf = new RealtimeSpeechConf(source.RealtimeSpeechConf);
        }
        if (source.VoiceMessageConf != null) {
            this.VoiceMessageConf = new VoiceMessageConf(source.VoiceMessageConf);
        }
        if (source.VoiceFilterConf != null) {
            this.VoiceFilterConf = new VoiceFilterConf(source.VoiceFilterConf);
        }
        if (source.AsrConf != null) {
            this.AsrConf = new AsrConf(source.AsrConf);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "EngineList.", this.EngineList);
        this.setParamArraySimple(map, prefix + "RegionList.", this.RegionList);
        this.setParamObj(map, prefix + "RealtimeSpeechConf.", this.RealtimeSpeechConf);
        this.setParamObj(map, prefix + "VoiceMessageConf.", this.VoiceMessageConf);
        this.setParamObj(map, prefix + "VoiceFilterConf.", this.VoiceFilterConf);
        this.setParamObj(map, prefix + "AsrConf.", this.AsrConf);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

