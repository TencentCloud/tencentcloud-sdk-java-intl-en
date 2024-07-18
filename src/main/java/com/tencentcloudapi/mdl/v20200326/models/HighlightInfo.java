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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HighlightInfo extends AbstractModel {

    /**
    * Whether to enable input recognition 0: Disable 1 Enable Default value 0 Disable.
    */
    @SerializedName("HighlightEnabled")
    @Expose
    private Long HighlightEnabled;

    /**
    * The product where the results are saved, optional: COS. Currently, only Tencent Cloud COS is supported. In the future, it will be connected to AWS S3 and COS will be used by default.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Valid when Type is COS, the region where COS is stored.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Valid when Type is COS, the bucket name stored in COS.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * Valid when Type is COS, the path where cos is stored.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Valid when Type is COS, the file name stored in cos.
    */
    @SerializedName("Filename")
    @Expose
    private String Filename;

    /**
    * Valid when Type is COS, the file name suffix stored in COS is automatically generated in the time format, optional values: unix, utc. Unix is the second-level timestamp and UTC is the year, month and day represented by the zero time zone.
    */
    @SerializedName("TimestampFormat")
    @Expose
    private String TimestampFormat;

    /**
    * Audio selector list is optional and can be empty. If not filled in, an audio will be used as the output of the recognition result by default.
    */
    @SerializedName("AudioSelectorNames")
    @Expose
    private String [] AudioSelectorNames;

    /**
     * Get Whether to enable input recognition 0: Disable 1 Enable Default value 0 Disable. 
     * @return HighlightEnabled Whether to enable input recognition 0: Disable 1 Enable Default value 0 Disable.
     */
    public Long getHighlightEnabled() {
        return this.HighlightEnabled;
    }

    /**
     * Set Whether to enable input recognition 0: Disable 1 Enable Default value 0 Disable.
     * @param HighlightEnabled Whether to enable input recognition 0: Disable 1 Enable Default value 0 Disable.
     */
    public void setHighlightEnabled(Long HighlightEnabled) {
        this.HighlightEnabled = HighlightEnabled;
    }

    /**
     * Get The product where the results are saved, optional: COS. Currently, only Tencent Cloud COS is supported. In the future, it will be connected to AWS S3 and COS will be used by default. 
     * @return Type The product where the results are saved, optional: COS. Currently, only Tencent Cloud COS is supported. In the future, it will be connected to AWS S3 and COS will be used by default.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The product where the results are saved, optional: COS. Currently, only Tencent Cloud COS is supported. In the future, it will be connected to AWS S3 and COS will be used by default.
     * @param Type The product where the results are saved, optional: COS. Currently, only Tencent Cloud COS is supported. In the future, it will be connected to AWS S3 and COS will be used by default.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Valid when Type is COS, the region where COS is stored. 
     * @return Region Valid when Type is COS, the region where COS is stored.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Valid when Type is COS, the region where COS is stored.
     * @param Region Valid when Type is COS, the region where COS is stored.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Valid when Type is COS, the bucket name stored in COS. 
     * @return Bucket Valid when Type is COS, the bucket name stored in COS.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set Valid when Type is COS, the bucket name stored in COS.
     * @param Bucket Valid when Type is COS, the bucket name stored in COS.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get Valid when Type is COS, the path where cos is stored. 
     * @return Path Valid when Type is COS, the path where cos is stored.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Valid when Type is COS, the path where cos is stored.
     * @param Path Valid when Type is COS, the path where cos is stored.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Valid when Type is COS, the file name stored in cos. 
     * @return Filename Valid when Type is COS, the file name stored in cos.
     */
    public String getFilename() {
        return this.Filename;
    }

    /**
     * Set Valid when Type is COS, the file name stored in cos.
     * @param Filename Valid when Type is COS, the file name stored in cos.
     */
    public void setFilename(String Filename) {
        this.Filename = Filename;
    }

    /**
     * Get Valid when Type is COS, the file name suffix stored in COS is automatically generated in the time format, optional values: unix, utc. Unix is the second-level timestamp and UTC is the year, month and day represented by the zero time zone. 
     * @return TimestampFormat Valid when Type is COS, the file name suffix stored in COS is automatically generated in the time format, optional values: unix, utc. Unix is the second-level timestamp and UTC is the year, month and day represented by the zero time zone.
     */
    public String getTimestampFormat() {
        return this.TimestampFormat;
    }

    /**
     * Set Valid when Type is COS, the file name suffix stored in COS is automatically generated in the time format, optional values: unix, utc. Unix is the second-level timestamp and UTC is the year, month and day represented by the zero time zone.
     * @param TimestampFormat Valid when Type is COS, the file name suffix stored in COS is automatically generated in the time format, optional values: unix, utc. Unix is the second-level timestamp and UTC is the year, month and day represented by the zero time zone.
     */
    public void setTimestampFormat(String TimestampFormat) {
        this.TimestampFormat = TimestampFormat;
    }

    /**
     * Get Audio selector list is optional and can be empty. If not filled in, an audio will be used as the output of the recognition result by default. 
     * @return AudioSelectorNames Audio selector list is optional and can be empty. If not filled in, an audio will be used as the output of the recognition result by default.
     */
    public String [] getAudioSelectorNames() {
        return this.AudioSelectorNames;
    }

    /**
     * Set Audio selector list is optional and can be empty. If not filled in, an audio will be used as the output of the recognition result by default.
     * @param AudioSelectorNames Audio selector list is optional and can be empty. If not filled in, an audio will be used as the output of the recognition result by default.
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

