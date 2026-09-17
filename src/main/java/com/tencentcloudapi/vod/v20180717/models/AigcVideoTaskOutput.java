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

public class AigcVideoTaskOutput extends AbstractModel {

    /**
    * 
    */
    @SerializedName("FileInfos")
    @Expose
    private AigcVideoTaskOutputFileInfo [] FileInfos;

    /**
    * 
    */
    @SerializedName("ProcedureTaskIds")
    @Expose
    private String [] ProcedureTaskIds;

    /**
    * 
    */
    @SerializedName("Usage")
    @Expose
    private AigcVideoTaskUsage Usage;

    /**
     * Get  
     * @return FileInfos 
     */
    public AigcVideoTaskOutputFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set 
     * @param FileInfos 
     */
    public void setFileInfos(AigcVideoTaskOutputFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get  
     * @return ProcedureTaskIds 
     */
    public String [] getProcedureTaskIds() {
        return this.ProcedureTaskIds;
    }

    /**
     * Set 
     * @param ProcedureTaskIds 
     */
    public void setProcedureTaskIds(String [] ProcedureTaskIds) {
        this.ProcedureTaskIds = ProcedureTaskIds;
    }

    /**
     * Get  
     * @return Usage 
     */
    public AigcVideoTaskUsage getUsage() {
        return this.Usage;
    }

    /**
     * Set 
     * @param Usage 
     */
    public void setUsage(AigcVideoTaskUsage Usage) {
        this.Usage = Usage;
    }

    public AigcVideoTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoTaskOutput(AigcVideoTaskOutput source) {
        if (source.FileInfos != null) {
            this.FileInfos = new AigcVideoTaskOutputFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new AigcVideoTaskOutputFileInfo(source.FileInfos[i]);
            }
        }
        if (source.ProcedureTaskIds != null) {
            this.ProcedureTaskIds = new String[source.ProcedureTaskIds.length];
            for (int i = 0; i < source.ProcedureTaskIds.length; i++) {
                this.ProcedureTaskIds[i] = new String(source.ProcedureTaskIds[i]);
            }
        }
        if (source.Usage != null) {
            this.Usage = new AigcVideoTaskUsage(source.Usage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamArraySimple(map, prefix + "ProcedureTaskIds.", this.ProcedureTaskIds);
        this.setParamObj(map, prefix + "Usage.", this.Usage);

    }
}

