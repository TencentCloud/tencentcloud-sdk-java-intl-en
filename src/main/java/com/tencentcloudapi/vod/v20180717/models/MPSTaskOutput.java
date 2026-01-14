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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MPSTaskOutput extends AbstractModel {

    /**
    * The file type in the task's return result. For example, in a smart erase, the erased video file will be stored in the media asset and its FileId will be given in this field. The URL of the subtitle file extracted based on the image will also be given in this field.
    */
    @SerializedName("OutputFiles")
    @Expose
    private MPSOutputFile [] OutputFiles;

    /**
     * Get The file type in the task's return result. For example, in a smart erase, the erased video file will be stored in the media asset and its FileId will be given in this field. The URL of the subtitle file extracted based on the image will also be given in this field. 
     * @return OutputFiles The file type in the task's return result. For example, in a smart erase, the erased video file will be stored in the media asset and its FileId will be given in this field. The URL of the subtitle file extracted based on the image will also be given in this field.
     */
    public MPSOutputFile [] getOutputFiles() {
        return this.OutputFiles;
    }

    /**
     * Set The file type in the task's return result. For example, in a smart erase, the erased video file will be stored in the media asset and its FileId will be given in this field. The URL of the subtitle file extracted based on the image will also be given in this field.
     * @param OutputFiles The file type in the task's return result. For example, in a smart erase, the erased video file will be stored in the media asset and its FileId will be given in this field. The URL of the subtitle file extracted based on the image will also be given in this field.
     */
    public void setOutputFiles(MPSOutputFile [] OutputFiles) {
        this.OutputFiles = OutputFiles;
    }

    public MPSTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSTaskOutput(MPSTaskOutput source) {
        if (source.OutputFiles != null) {
            this.OutputFiles = new MPSOutputFile[source.OutputFiles.length];
            for (int i = 0; i < source.OutputFiles.length; i++) {
                this.OutputFiles[i] = new MPSOutputFile(source.OutputFiles[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "OutputFiles.", this.OutputFiles);

    }
}

