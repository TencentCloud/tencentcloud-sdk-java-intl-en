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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventSettingsResp extends AbstractModel{

    /**
    * Only `INPUT_SWITCH` is supported currently.
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * ID of the input attached, which is not empty if `EventType` is `INPUT_SWITCH`
    */
    @SerializedName("InputAttachment")
    @Expose
    private String InputAttachment;

    /**
    * Name of the output group attached. This parameter is not empty if `EventType` is `TIMED_RECORD`.
    */
    @SerializedName("OutputGroupName")
    @Expose
    private String OutputGroupName;

    /**
    * Name of the manifest file for timed recording, which ends with `.m3u8` for HLS and `.mpd` for DASH. This parameter is not empty if `EventType` is `TIMED_RECORD`.
    */
    @SerializedName("ManifestName")
    @Expose
    private String ManifestName;

    /**
    * URL of the COS bucket where recording files are saved. This parameter is not empty if `EventType` is `TIMED_RECORD`. It may contain 1 or 2 URLs. The first URL corresponds to pipeline 0 and the second pipeline 1.
    */
    @SerializedName("Destinations")
    @Expose
    private EventSettingsDestinationResp [] Destinations;

    /**
     * Get Only `INPUT_SWITCH` is supported currently. 
     * @return EventType Only `INPUT_SWITCH` is supported currently.
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set Only `INPUT_SWITCH` is supported currently.
     * @param EventType Only `INPUT_SWITCH` is supported currently.
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get ID of the input attached, which is not empty if `EventType` is `INPUT_SWITCH` 
     * @return InputAttachment ID of the input attached, which is not empty if `EventType` is `INPUT_SWITCH`
     */
    public String getInputAttachment() {
        return this.InputAttachment;
    }

    /**
     * Set ID of the input attached, which is not empty if `EventType` is `INPUT_SWITCH`
     * @param InputAttachment ID of the input attached, which is not empty if `EventType` is `INPUT_SWITCH`
     */
    public void setInputAttachment(String InputAttachment) {
        this.InputAttachment = InputAttachment;
    }

    /**
     * Get Name of the output group attached. This parameter is not empty if `EventType` is `TIMED_RECORD`. 
     * @return OutputGroupName Name of the output group attached. This parameter is not empty if `EventType` is `TIMED_RECORD`.
     */
    public String getOutputGroupName() {
        return this.OutputGroupName;
    }

    /**
     * Set Name of the output group attached. This parameter is not empty if `EventType` is `TIMED_RECORD`.
     * @param OutputGroupName Name of the output group attached. This parameter is not empty if `EventType` is `TIMED_RECORD`.
     */
    public void setOutputGroupName(String OutputGroupName) {
        this.OutputGroupName = OutputGroupName;
    }

    /**
     * Get Name of the manifest file for timed recording, which ends with `.m3u8` for HLS and `.mpd` for DASH. This parameter is not empty if `EventType` is `TIMED_RECORD`. 
     * @return ManifestName Name of the manifest file for timed recording, which ends with `.m3u8` for HLS and `.mpd` for DASH. This parameter is not empty if `EventType` is `TIMED_RECORD`.
     */
    public String getManifestName() {
        return this.ManifestName;
    }

    /**
     * Set Name of the manifest file for timed recording, which ends with `.m3u8` for HLS and `.mpd` for DASH. This parameter is not empty if `EventType` is `TIMED_RECORD`.
     * @param ManifestName Name of the manifest file for timed recording, which ends with `.m3u8` for HLS and `.mpd` for DASH. This parameter is not empty if `EventType` is `TIMED_RECORD`.
     */
    public void setManifestName(String ManifestName) {
        this.ManifestName = ManifestName;
    }

    /**
     * Get URL of the COS bucket where recording files are saved. This parameter is not empty if `EventType` is `TIMED_RECORD`. It may contain 1 or 2 URLs. The first URL corresponds to pipeline 0 and the second pipeline 1. 
     * @return Destinations URL of the COS bucket where recording files are saved. This parameter is not empty if `EventType` is `TIMED_RECORD`. It may contain 1 or 2 URLs. The first URL corresponds to pipeline 0 and the second pipeline 1.
     */
    public EventSettingsDestinationResp [] getDestinations() {
        return this.Destinations;
    }

    /**
     * Set URL of the COS bucket where recording files are saved. This parameter is not empty if `EventType` is `TIMED_RECORD`. It may contain 1 or 2 URLs. The first URL corresponds to pipeline 0 and the second pipeline 1.
     * @param Destinations URL of the COS bucket where recording files are saved. This parameter is not empty if `EventType` is `TIMED_RECORD`. It may contain 1 or 2 URLs. The first URL corresponds to pipeline 0 and the second pipeline 1.
     */
    public void setDestinations(EventSettingsDestinationResp [] Destinations) {
        this.Destinations = Destinations;
    }

    public EventSettingsResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventSettingsResp(EventSettingsResp source) {
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.InputAttachment != null) {
            this.InputAttachment = new String(source.InputAttachment);
        }
        if (source.OutputGroupName != null) {
            this.OutputGroupName = new String(source.OutputGroupName);
        }
        if (source.ManifestName != null) {
            this.ManifestName = new String(source.ManifestName);
        }
        if (source.Destinations != null) {
            this.Destinations = new EventSettingsDestinationResp[source.Destinations.length];
            for (int i = 0; i < source.Destinations.length; i++) {
                this.Destinations[i] = new EventSettingsDestinationResp(source.Destinations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "InputAttachment", this.InputAttachment);
        this.setParamSimple(map, prefix + "OutputGroupName", this.OutputGroupName);
        this.setParamSimple(map, prefix + "ManifestName", this.ManifestName);
        this.setParamArrayObj(map, prefix + "Destinations.", this.Destinations);

    }
}

