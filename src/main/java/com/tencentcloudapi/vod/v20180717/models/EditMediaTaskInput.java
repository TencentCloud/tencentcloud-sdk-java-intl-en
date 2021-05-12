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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EditMediaTaskInput extends AbstractModel{

    /**
    * Input video source type. Valid values: File, Stream.
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
    * Information of input video file. This field has a value only when `InputType` is `File`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileInfoSet")
    @Expose
    private EditMediaFileInfo [] FileInfoSet;

    /**
    * Input stream information. This field has a value only when `InputType` is `Stream`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StreamInfoSet")
    @Expose
    private EditMediaStreamInfo [] StreamInfoSet;

    /**
     * Get Input video source type. Valid values: File, Stream. 
     * @return InputType Input video source type. Valid values: File, Stream.
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * Set Input video source type. Valid values: File, Stream.
     * @param InputType Input video source type. Valid values: File, Stream.
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    /**
     * Get Information of input video file. This field has a value only when `InputType` is `File`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FileInfoSet Information of input video file. This field has a value only when `InputType` is `File`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public EditMediaFileInfo [] getFileInfoSet() {
        return this.FileInfoSet;
    }

    /**
     * Set Information of input video file. This field has a value only when `InputType` is `File`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FileInfoSet Information of input video file. This field has a value only when `InputType` is `File`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFileInfoSet(EditMediaFileInfo [] FileInfoSet) {
        this.FileInfoSet = FileInfoSet;
    }

    /**
     * Get Input stream information. This field has a value only when `InputType` is `Stream`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StreamInfoSet Input stream information. This field has a value only when `InputType` is `Stream`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public EditMediaStreamInfo [] getStreamInfoSet() {
        return this.StreamInfoSet;
    }

    /**
     * Set Input stream information. This field has a value only when `InputType` is `Stream`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StreamInfoSet Input stream information. This field has a value only when `InputType` is `Stream`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStreamInfoSet(EditMediaStreamInfo [] StreamInfoSet) {
        this.StreamInfoSet = StreamInfoSet;
    }

    public EditMediaTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EditMediaTaskInput(EditMediaTaskInput source) {
        if (source.InputType != null) {
            this.InputType = new String(source.InputType);
        }
        if (source.FileInfoSet != null) {
            this.FileInfoSet = new EditMediaFileInfo[source.FileInfoSet.length];
            for (int i = 0; i < source.FileInfoSet.length; i++) {
                this.FileInfoSet[i] = new EditMediaFileInfo(source.FileInfoSet[i]);
            }
        }
        if (source.StreamInfoSet != null) {
            this.StreamInfoSet = new EditMediaStreamInfo[source.StreamInfoSet.length];
            for (int i = 0; i < source.StreamInfoSet.length; i++) {
                this.StreamInfoSet[i] = new EditMediaStreamInfo(source.StreamInfoSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamArrayObj(map, prefix + "FileInfoSet.", this.FileInfoSet);
        this.setParamArrayObj(map, prefix + "StreamInfoSet.", this.StreamInfoSet);

    }
}

