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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserApplicationFileInfo extends AbstractModel {

    /**
    * Application file path.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * File status. NO_EXIST: The file does not exist; EXIST: The file exists.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileState")
    @Expose
    private String FileState;

    /**
     * Get Application file path.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FilePath Application file path.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set Application file path.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FilePath Application file path.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get File status. NO_EXIST: The file does not exist; EXIST: The file exists.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileState File status. NO_EXIST: The file does not exist; EXIST: The file exists.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFileState() {
        return this.FileState;
    }

    /**
     * Set File status. NO_EXIST: The file does not exist; EXIST: The file exists.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileState File status. NO_EXIST: The file does not exist; EXIST: The file exists.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileState(String FileState) {
        this.FileState = FileState;
    }

    public UserApplicationFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserApplicationFileInfo(UserApplicationFileInfo source) {
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.FileState != null) {
            this.FileState = new String(source.FileState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "FileState", this.FileState);

    }
}

