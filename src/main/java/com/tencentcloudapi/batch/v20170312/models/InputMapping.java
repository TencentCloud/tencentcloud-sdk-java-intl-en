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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputMapping extends AbstractModel{

    /**
    * Source path
    */
    @SerializedName("SourcePath")
    @Expose
    private String SourcePath;

    /**
    * Destination path
    */
    @SerializedName("DestinationPath")
    @Expose
    private String DestinationPath;

    /**
    * Mounting configuration item parameter
    */
    @SerializedName("MountOptionParameter")
    @Expose
    private String MountOptionParameter;

    /**
     * Get Source path 
     * @return SourcePath Source path
     */
    public String getSourcePath() {
        return this.SourcePath;
    }

    /**
     * Set Source path
     * @param SourcePath Source path
     */
    public void setSourcePath(String SourcePath) {
        this.SourcePath = SourcePath;
    }

    /**
     * Get Destination path 
     * @return DestinationPath Destination path
     */
    public String getDestinationPath() {
        return this.DestinationPath;
    }

    /**
     * Set Destination path
     * @param DestinationPath Destination path
     */
    public void setDestinationPath(String DestinationPath) {
        this.DestinationPath = DestinationPath;
    }

    /**
     * Get Mounting configuration item parameter 
     * @return MountOptionParameter Mounting configuration item parameter
     */
    public String getMountOptionParameter() {
        return this.MountOptionParameter;
    }

    /**
     * Set Mounting configuration item parameter
     * @param MountOptionParameter Mounting configuration item parameter
     */
    public void setMountOptionParameter(String MountOptionParameter) {
        this.MountOptionParameter = MountOptionParameter;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourcePath", this.SourcePath);
        this.setParamSimple(map, prefix + "DestinationPath", this.DestinationPath);
        this.setParamSimple(map, prefix + "MountOptionParameter", this.MountOptionParameter);

    }
}

