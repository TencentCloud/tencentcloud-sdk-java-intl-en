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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HighlightInfo extends AbstractModel {

    /**
    * Whether to enable input recognition  0: disabled  1: enabled  Default value: 0.
    */
    @SerializedName("HighlightEnabled")
    @Expose
    private Long HighlightEnabled;

    /**
    * Products to save results. Option: COS.
Currently supports Tencent Cloud COS only. AWS S3 integration will be supported later. Default is COS.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Valid when Type is COS. Region of COS storage.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Valid when Type is COS. Bucket name of COS storage.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * Valid when Type is COS. Path of COS storage.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Valid when Type is COS. Name of the stored file in COS.
    */
    @SerializedName("Filename")
    @Expose
    private String Filename;

    /**
    * Valid when Type is COS. The file extension of COS storage is automatically generated in time format. Available values: unix, utc.
unix is a second-level timestamp. utc 0 represents the year, month, day.
    */
    @SerializedName("TimestampFormat")
    @Expose
    private String TimestampFormat;

    /**
    * Audio selector list, selectable, can be left blank. By default, an audio is used as the output of the recognition result.
    */
    @SerializedName("AudioSelectorNames")
    @Expose
    private String [] AudioSelectorNames;

    /**
     * Get Whether to enable input recognition  0: disabled  1: enabled  Default value: 0. 
     * @return HighlightEnabled Whether to enable input recognition  0: disabled  1: enabled  Default value: 0.
     */
    public Long getHighlightEnabled() {
        return this.HighlightEnabled;
    }

    /**
     * Set Whether to enable input recognition  0: disabled  1: enabled  Default value: 0.
     * @param HighlightEnabled Whether to enable input recognition  0: disabled  1: enabled  Default value: 0.
     */
    public void setHighlightEnabled(Long HighlightEnabled) {
        this.HighlightEnabled = HighlightEnabled;
    }

    /**
     * Get Products to save results. Option: COS.
Currently supports Tencent Cloud COS only. AWS S3 integration will be supported later. Default is COS. 
     * @return Type Products to save results. Option: COS.
Currently supports Tencent Cloud COS only. AWS S3 integration will be supported later. Default is COS.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Products to save results. Option: COS.
Currently supports Tencent Cloud COS only. AWS S3 integration will be supported later. Default is COS.
     * @param Type Products to save results. Option: COS.
Currently supports Tencent Cloud COS only. AWS S3 integration will be supported later. Default is COS.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Valid when Type is COS. Region of COS storage. 
     * @return Region Valid when Type is COS. Region of COS storage.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Valid when Type is COS. Region of COS storage.
     * @param Region Valid when Type is COS. Region of COS storage.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Valid when Type is COS. Bucket name of COS storage. 
     * @return Bucket Valid when Type is COS. Bucket name of COS storage.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set Valid when Type is COS. Bucket name of COS storage.
     * @param Bucket Valid when Type is COS. Bucket name of COS storage.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get Valid when Type is COS. Path of COS storage. 
     * @return Path Valid when Type is COS. Path of COS storage.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Valid when Type is COS. Path of COS storage.
     * @param Path Valid when Type is COS. Path of COS storage.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Valid when Type is COS. Name of the stored file in COS. 
     * @return Filename Valid when Type is COS. Name of the stored file in COS.
     */
    public String getFilename() {
        return this.Filename;
    }

    /**
     * Set Valid when Type is COS. Name of the stored file in COS.
     * @param Filename Valid when Type is COS. Name of the stored file in COS.
     */
    public void setFilename(String Filename) {
        this.Filename = Filename;
    }

    /**
     * Get Valid when Type is COS. The file extension of COS storage is automatically generated in time format. Available values: unix, utc.
unix is a second-level timestamp. utc 0 represents the year, month, day. 
     * @return TimestampFormat Valid when Type is COS. The file extension of COS storage is automatically generated in time format. Available values: unix, utc.
unix is a second-level timestamp. utc 0 represents the year, month, day.
     */
    public String getTimestampFormat() {
        return this.TimestampFormat;
    }

    /**
     * Set Valid when Type is COS. The file extension of COS storage is automatically generated in time format. Available values: unix, utc.
unix is a second-level timestamp. utc 0 represents the year, month, day.
     * @param TimestampFormat Valid when Type is COS. The file extension of COS storage is automatically generated in time format. Available values: unix, utc.
unix is a second-level timestamp. utc 0 represents the year, month, day.
     */
    public void setTimestampFormat(String TimestampFormat) {
        this.TimestampFormat = TimestampFormat;
    }

    /**
     * Get Audio selector list, selectable, can be left blank. By default, an audio is used as the output of the recognition result. 
     * @return AudioSelectorNames Audio selector list, selectable, can be left blank. By default, an audio is used as the output of the recognition result.
     */
    public String [] getAudioSelectorNames() {
        return this.AudioSelectorNames;
    }

    /**
     * Set Audio selector list, selectable, can be left blank. By default, an audio is used as the output of the recognition result.
     * @param AudioSelectorNames Audio selector list, selectable, can be left blank. By default, an audio is used as the output of the recognition result.
     */
    public void setAudioSelectorNames(String [] AudioSelectorNames) {
        this.AudioSelectorNames = AudioSelectorNames;
    }

    public HighlightInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HighlightInfo(HighlightInfo source) {
        if (source.HighlightEnabled != null) {
            this.HighlightEnabled = new Long(source.HighlightEnabled);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Filename != null) {
            this.Filename = new String(source.Filename);
        }
        if (source.TimestampFormat != null) {
            this.TimestampFormat = new String(source.TimestampFormat);
        }
        if (source.AudioSelectorNames != null) {
            this.AudioSelectorNames = new String[source.AudioSelectorNames.length];
            for (int i = 0; i < source.AudioSelectorNames.length; i++) {
                this.AudioSelectorNames[i] = new String(source.AudioSelectorNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HighlightEnabled", this.HighlightEnabled);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Filename", this.Filename);
        this.setParamSimple(map, prefix + "TimestampFormat", this.TimestampFormat);
        this.setParamArraySimple(map, prefix + "AudioSelectorNames.", this.AudioSelectorNames);

    }
}

