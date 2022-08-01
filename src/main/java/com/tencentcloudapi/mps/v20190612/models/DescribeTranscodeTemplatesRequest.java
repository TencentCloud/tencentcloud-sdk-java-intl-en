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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTranscodeTemplatesRequest extends AbstractModel{

    /**
    * Unique ID filter of transcoding templates. Array length limit: 100.
    */
    @SerializedName("Definitions")
    @Expose
    private Long [] Definitions;

    /**
    * Template type filter. Valid values:
<li>Preset: Preset template;</li>
<li>Custom: Custom template.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Container format filter. Valid values:
<li>Video: Video container format that can contain both video stream and audio stream;</li>
<li>PureAudio: Audio container format that can contain only audio stream.</li>
    */
    @SerializedName("ContainerType")
    @Expose
    private String ContainerType;

    /**
    * TESHD filter, which is used to filter common transcoding or ultra-fast HD transcoding templates. Valid values:
<li>Common: Common transcoding template;</li>
<li>TEHD: TESHD template.</li>
    */
    @SerializedName("TEHDType")
    @Expose
    private String TEHDType;

    /**
    * Paging offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned entries. Default value: 10. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The template type (replacing `TEHDType`). Valid values:
<li>Common: Common transcoding template</li>
<li>TEHD: TESHD template</li>
<li>Enhance: Audio/Video enhancement template.</li>
This parameter is left empty by default, which indicates to return all types of templates.
    */
    @SerializedName("TranscodeType")
    @Expose
    private String TranscodeType;

    /**
     * Get Unique ID filter of transcoding templates. Array length limit: 100. 
     * @return Definitions Unique ID filter of transcoding templates. Array length limit: 100.
     */
    public Long [] getDefinitions() {
        return this.Definitions;
    }

    /**
     * Set Unique ID filter of transcoding templates. Array length limit: 100.
     * @param Definitions Unique ID filter of transcoding templates. Array length limit: 100.
     */
    public void setDefinitions(Long [] Definitions) {
        this.Definitions = Definitions;
    }

    /**
     * Get Template type filter. Valid values:
<li>Preset: Preset template;</li>
<li>Custom: Custom template.</li> 
     * @return Type Template type filter. Valid values:
<li>Preset: Preset template;</li>
<li>Custom: Custom template.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Template type filter. Valid values:
<li>Preset: Preset template;</li>
<li>Custom: Custom template.</li>
     * @param Type Template type filter. Valid values:
<li>Preset: Preset template;</li>
<li>Custom: Custom template.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Container format filter. Valid values:
<li>Video: Video container format that can contain both video stream and audio stream;</li>
<li>PureAudio: Audio container format that can contain only audio stream.</li> 
     * @return ContainerType Container format filter. Valid values:
<li>Video: Video container format that can contain both video stream and audio stream;</li>
<li>PureAudio: Audio container format that can contain only audio stream.</li>
     */
    public String getContainerType() {
        return this.ContainerType;
    }

    /**
     * Set Container format filter. Valid values:
<li>Video: Video container format that can contain both video stream and audio stream;</li>
<li>PureAudio: Audio container format that can contain only audio stream.</li>
     * @param ContainerType Container format filter. Valid values:
<li>Video: Video container format that can contain both video stream and audio stream;</li>
<li>PureAudio: Audio container format that can contain only audio stream.</li>
     */
    public void setContainerType(String ContainerType) {
        this.ContainerType = ContainerType;
    }

    /**
     * Get TESHD filter, which is used to filter common transcoding or ultra-fast HD transcoding templates. Valid values:
<li>Common: Common transcoding template;</li>
<li>TEHD: TESHD template.</li> 
     * @return TEHDType TESHD filter, which is used to filter common transcoding or ultra-fast HD transcoding templates. Valid values:
<li>Common: Common transcoding template;</li>
<li>TEHD: TESHD template.</li>
     */
    public String getTEHDType() {
        return this.TEHDType;
    }

    /**
     * Set TESHD filter, which is used to filter common transcoding or ultra-fast HD transcoding templates. Valid values:
<li>Common: Common transcoding template;</li>
<li>TEHD: TESHD template.</li>
     * @param TEHDType TESHD filter, which is used to filter common transcoding or ultra-fast HD transcoding templates. Valid values:
<li>Common: Common transcoding template;</li>
<li>TEHD: TESHD template.</li>
     */
    public void setTEHDType(String TEHDType) {
        this.TEHDType = TEHDType;
    }

    /**
     * Get Paging offset. Default value: 0. 
     * @return Offset Paging offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Paging offset. Default value: 0.
     * @param Offset Paging offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned entries. Default value: 10. Maximum value: 100. 
     * @return Limit Number of returned entries. Default value: 10. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned entries. Default value: 10. Maximum value: 100.
     * @param Limit Number of returned entries. Default value: 10. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The template type (replacing `TEHDType`). Valid values:
<li>Common: Common transcoding template</li>
<li>TEHD: TESHD template</li>
<li>Enhance: Audio/Video enhancement template.</li>
This parameter is left empty by default, which indicates to return all types of templates. 
     * @return TranscodeType The template type (replacing `TEHDType`). Valid values:
<li>Common: Common transcoding template</li>
<li>TEHD: TESHD template</li>
<li>Enhance: Audio/Video enhancement template.</li>
This parameter is left empty by default, which indicates to return all types of templates.
     */
    public String getTranscodeType() {
        return this.TranscodeType;
    }

    /**
     * Set The template type (replacing `TEHDType`). Valid values:
<li>Common: Common transcoding template</li>
<li>TEHD: TESHD template</li>
<li>Enhance: Audio/Video enhancement template.</li>
This parameter is left empty by default, which indicates to return all types of templates.
     * @param TranscodeType The template type (replacing `TEHDType`). Valid values:
<li>Common: Common transcoding template</li>
<li>TEHD: TESHD template</li>
<li>Enhance: Audio/Video enhancement template.</li>
This parameter is left empty by default, which indicates to return all types of templates.
     */
    public void setTranscodeType(String TranscodeType) {
        this.TranscodeType = TranscodeType;
    }

    public DescribeTranscodeTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTranscodeTemplatesRequest(DescribeTranscodeTemplatesRequest source) {
        if (source.Definitions != null) {
            this.Definitions = new Long[source.Definitions.length];
            for (int i = 0; i < source.Definitions.length; i++) {
                this.Definitions[i] = new Long(source.Definitions[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ContainerType != null) {
            this.ContainerType = new String(source.ContainerType);
        }
        if (source.TEHDType != null) {
            this.TEHDType = new String(source.TEHDType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.TranscodeType != null) {
            this.TranscodeType = new String(source.TranscodeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Definitions.", this.Definitions);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ContainerType", this.ContainerType);
        this.setParamSimple(map, prefix + "TEHDType", this.TEHDType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "TranscodeType", this.TranscodeType);

    }
}

