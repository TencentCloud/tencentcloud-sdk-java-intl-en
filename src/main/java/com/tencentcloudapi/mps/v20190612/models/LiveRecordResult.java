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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveRecordResult extends AbstractModel {

    /**
    * The storage of the recording file.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * The recording segments.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileList")
    @Expose
    private LiveRecordFile [] FileList;

    /**
     * Get The storage of the recording file.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OutputStorage The storage of the recording file.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set The storage of the recording file.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OutputStorage The storage of the recording file.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get The recording segments.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileList The recording segments.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LiveRecordFile [] getFileList() {
        return this.FileList;
    }

    /**
     * Set The recording segments.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileList The recording segments.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileList(LiveRecordFile [] FileList) {
        this.FileList = FileList;
    }

    public LiveRecordResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveRecordResult(LiveRecordResult source) {
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.FileList != null) {
            this.FileList = new LiveRecordFile[source.FileList.length];
            for (int i = 0; i < source.FileList.length; i++) {
                this.FileList[i] = new LiveRecordFile(source.FileList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamArrayObj(map, prefix + "FileList.", this.FileList);

    }
}

