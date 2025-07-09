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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordControl extends AbstractModel {

    /**
    * It specifies whether to enable RecordControl. Valid values: true (yes); false (no).
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * A global parameter generally used in conjunction with `StreamControls` that specifies whether to disable recording. Valid values:

true: no stream is recorded.
false: all streams are recorded. Default value: false.

The setting in this parameter is applied to all streams. However, if `StreamControls` is passed in, the parameters in `StreamControls` will take precedence.
    */
    @SerializedName("DisableRecord")
    @Expose
    private Boolean DisableRecord;

    /**
    * A global parameter generally used in conjunction with `StreamControls` that specifies whether to disable audio recording over all streams. Valid values:

true: no audio recording of any streams.
false: audio recording of all streams. Default value: false.

The setting in this parameter is applied to all streams. However, if `StreamControls` is passed in, the parameters in `StreamControls` will take precedence.
    */
    @SerializedName("DisableAudio")
    @Expose
    private Boolean DisableAudio;

    /**
    * A global parameter generally used in conjunction with `StreamControls` that specifies whether to record low-resolution videos only. Valid values:

true: only records low-resolution videos for all streams. Please ensure that the up-streaming end pushes the low-resolution videos. Otherwise, the recorded video may be black.
false: high-resolution video recording of all streams. Default value: false.

The setting in this parameter is applied to all streams. However, if `StreamControls` is passed in, the parameters in `StreamControls` will take precedence.
    */
    @SerializedName("PullSmallVideo")
    @Expose
    private Boolean PullSmallVideo;

    /**
    * Parameters over specific streams, which take priority over global configurations. If it’s empty, all streams are recorded according to the global configurations. 
    */
    @SerializedName("StreamControls")
    @Expose
    private StreamControl [] StreamControls;

    /**
     * Get It specifies whether to enable RecordControl. Valid values: true (yes); false (no). 
     * @return Enabled It specifies whether to enable RecordControl. Valid values: true (yes); false (no).
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set It specifies whether to enable RecordControl. Valid values: true (yes); false (no).
     * @param Enabled It specifies whether to enable RecordControl. Valid values: true (yes); false (no).
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get A global parameter generally used in conjunction with `StreamControls` that specifies whether to disable recording. Valid values:

true: no stream is recorded.
false: all streams are recorded. Default value: false.

The setting in this parameter is applied to all streams. However, if `StreamControls` is passed in, the parameters in `StreamControls` will take precedence. 
     * @return DisableRecord A global parameter generally used in conjunction with `StreamControls` that specifies whether to disable recording. Valid values:

true: no stream is recorded.
false: all streams are recorded. Default value: false.

The setting in this parameter is applied to all streams. However, if `StreamControls` is passed in, the parameters in `StreamControls` will take precedence.
     */
    public Boolean getDisableRecord() {
        return this.DisableRecord;
    }

    /**
     * Set A global parameter generally used in conjunction with `StreamControls` that specifies whether to disable recording. Valid values:

true: no stream is recorded.
false: all streams are recorded. Default value: false.

The setting in this parameter is applied to all streams. However, if `StreamControls` is passed in, the parameters in `StreamControls` will take precedence.
     * @param DisableRecord A global parameter generally used in conjunction with `StreamControls` that specifies whether to disable recording. Valid values:

true: no stream is recorded.
false: all streams are recorded. Default value: false.

The setting in this parameter is applied to all streams. However, if `StreamControls` is passed in, the parameters in `StreamControls` will take precedence.
     */
    public void setDisableRecord(Boolean DisableRecord) {
        this.DisableRecord = DisableRecord;
    }

    /**
     * Get A global parameter generally used in conjunction with `StreamControls` that specifies whether to disable audio recording over all streams. Valid values:

true: no audio recording of any streams.
false: audio recording of all streams. Default value: false.

The setting in this parameter is applied to all streams. However, if `StreamControls` is passed in, the parameters in `StreamControls` will take precedence. 
     * @return DisableAudio A global parameter generally used in conjunction with `StreamControls` that specifies whether to disable audio recording over all streams. Valid values:

true: no audio recording of any streams.
false: audio recording of all streams. Default value: false.

The setting in this parameter is applied to all streams. However, if `StreamControls` is passed in, the parameters in `StreamControls` will take precedence.
     */
    public Boolean getDisableAudio() {
        return this.DisableAudio;
    }

    /**
     * Set A global parameter generally used in conjunction with `StreamControls` that specifies whether to disable audio recording over all streams. Valid values:

true: no audio recording of any streams.
false: audio recording of all streams. Default value: false.

The setting in this parameter is applied to all streams. However, if `StreamControls` is passed in, the parameters in `StreamControls` will take precedence.
     * @param DisableAudio A global parameter generally used in conjunction with `StreamControls` that specifies whether to disable audio recording over all streams. Valid values:

true: no audio recording of any streams.
false: audio recording of all streams. Default value: false.

The setting in this parameter is applied to all streams. However, if `StreamControls` is passed in, the parameters in `StreamControls` will take precedence.
     */
    public void setDisableAudio(Boolean DisableAudio) {
        this.DisableAudio = DisableAudio;
    }

    /**
     * Get A global parameter generally used in conjunction with `StreamControls` that specifies whether to record low-resolution videos only. Valid values:

true: only records low-resolution videos for all streams. Please ensure that the up-streaming end pushes the low-resolution videos. Otherwise, the recorded video may be black.
false: high-resolution video recording of all streams. Default value: false.

The setting in this parameter is applied to all streams. However, if `StreamControls` is passed in, the parameters in `StreamControls` will take precedence. 
     * @return PullSmallVideo A global parameter generally used in conjunction with `StreamControls` that specifies whether to record low-resolution videos only. Valid values:

true: only records low-resolution videos for all streams. Please ensure that the up-streaming end pushes the low-resolution videos. Otherwise, the recorded video may be black.
false: high-resolution video recording of all streams. Default value: false.

The setting in this parameter is applied to all streams. However, if `StreamControls` is passed in, the parameters in `StreamControls` will take precedence.
     */
    public Boolean getPullSmallVideo() {
        return this.PullSmallVideo;
    }

    /**
     * Set A global parameter generally used in conjunction with `StreamControls` that specifies whether to record low-resolution videos only. Valid values:

true: only records low-resolution videos for all streams. Please ensure that the up-streaming end pushes the low-resolution videos. Otherwise, the recorded video may be black.
false: high-resolution video recording of all streams. Default value: false.

The setting in this parameter is applied to all streams. However, if `StreamControls` is passed in, the parameters in `StreamControls` will take precedence.
     * @param PullSmallVideo A global parameter generally used in conjunction with `StreamControls` that specifies whether to record low-resolution videos only. Valid values:

true: only records low-resolution videos for all streams. Please ensure that the up-streaming end pushes the low-resolution videos. Otherwise, the recorded video may be black.
false: high-resolution video recording of all streams. Default value: false.

The setting in this parameter is applied to all streams. However, if `StreamControls` is passed in, the parameters in `StreamControls` will take precedence.
     */
    public void setPullSmallVideo(Boolean PullSmallVideo) {
        this.PullSmallVideo = PullSmallVideo;
    }

    /**
     * Get Parameters over specific streams, which take priority over global configurations. If it’s empty, all streams are recorded according to the global configurations.  
     * @return StreamControls Parameters over specific streams, which take priority over global configurations. If it’s empty, all streams are recorded according to the global configurations. 
     */
    public StreamControl [] getStreamControls() {
        return this.StreamControls;
    }

    /**
     * Set Parameters over specific streams, which take priority over global configurations. If it’s empty, all streams are recorded according to the global configurations. 
     * @param StreamControls Parameters over specific streams, which take priority over global configurations. If it’s empty, all streams are recorded according to the global configurations. 
     */
    public void setStreamControls(StreamControl [] StreamControls) {
        this.StreamControls = StreamControls;
    }

    public RecordControl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordControl(RecordControl source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.DisableRecord != null) {
            this.DisableRecord = new Boolean(source.DisableRecord);
        }
        if (source.DisableAudio != null) {
            this.DisableAudio = new Boolean(source.DisableAudio);
        }
        if (source.PullSmallVideo != null) {
            this.PullSmallVideo = new Boolean(source.PullSmallVideo);
        }
        if (source.StreamControls != null) {
            this.StreamControls = new StreamControl[source.StreamControls.length];
            for (int i = 0; i < source.StreamControls.length; i++) {
                this.StreamControls[i] = new StreamControl(source.StreamControls[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "DisableRecord", this.DisableRecord);
        this.setParamSimple(map, prefix + "DisableAudio", this.DisableAudio);
        this.setParamSimple(map, prefix + "PullSmallVideo", this.PullSmallVideo);
        this.setParamArrayObj(map, prefix + "StreamControls.", this.StreamControls);

    }
}

