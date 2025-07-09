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

public class ImageProcessTaskOutput extends AbstractModel {

    /**
    * Path of the output file.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Storage location of the output file.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
     * Get Path of the output file.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Path Path of the output file.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Path of the output file.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Path Path of the output file.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Storage location of the output file.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OutputStorage Storage location of the output file.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set Storage location of the output file.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OutputStorage Storage location of the output file.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    public ImageProcessTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageProcessTaskOutput(ImageProcessTaskOutput source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);

    }
}

