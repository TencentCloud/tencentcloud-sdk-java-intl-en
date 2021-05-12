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

public class ClipTask2017 extends AbstractModel{

    /**
    * Video clipping task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * ID of source file for video clipping task.
    */
    @SerializedName("SrcFileId")
    @Expose
    private String SrcFileId;

    /**
    * Information of file output by video clipping.
    */
    @SerializedName("FileInfo")
    @Expose
    private ClipFileInfo2017 FileInfo;

    /**
     * Get Video clipping task ID. 
     * @return TaskId Video clipping task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Video clipping task ID.
     * @param TaskId Video clipping task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get ID of source file for video clipping task. 
     * @return SrcFileId ID of source file for video clipping task.
     */
    public String getSrcFileId() {
        return this.SrcFileId;
    }

    /**
     * Set ID of source file for video clipping task.
     * @param SrcFileId ID of source file for video clipping task.
     */
    public void setSrcFileId(String SrcFileId) {
        this.SrcFileId = SrcFileId;
    }

    /**
     * Get Information of file output by video clipping. 
     * @return FileInfo Information of file output by video clipping.
     */
    public ClipFileInfo2017 getFileInfo() {
        return this.FileInfo;
    }

    /**
     * Set Information of file output by video clipping.
     * @param FileInfo Information of file output by video clipping.
     */
    public void setFileInfo(ClipFileInfo2017 FileInfo) {
        this.FileInfo = FileInfo;
    }

    public ClipTask2017() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClipTask2017(ClipTask2017 source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SrcFileId != null) {
            this.SrcFileId = new String(source.SrcFileId);
        }
        if (source.FileInfo != null) {
            this.FileInfo = new ClipFileInfo2017(source.FileInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "SrcFileId", this.SrcFileId);
        this.setParamObj(map, prefix + "FileInfo.", this.FileInfo);

    }
}

