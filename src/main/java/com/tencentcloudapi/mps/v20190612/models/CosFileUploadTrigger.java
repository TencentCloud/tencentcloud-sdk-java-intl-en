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

public class CosFileUploadTrigger extends AbstractModel{

    /**
    * Name of the COS bucket bound to a workflow, such as `TopRankVideo-125xxx88`.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * Region of the COS bucket bound to a workflow, such as `ap-chongiqng`.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Input path directory bound to a workflow, such as `/movie/201907/`. If this parameter is left empty, the `/` root directory will be used.
    */
    @SerializedName("Dir")
    @Expose
    private String Dir;

    /**
    * Format list of files that can trigger a workflow, such as ["mp4", "flv", "mov"]. If this parameter is left empty, files in all formats can trigger the workflow.
    */
    @SerializedName("Formats")
    @Expose
    private String [] Formats;

    /**
     * Get Name of the COS bucket bound to a workflow, such as `TopRankVideo-125xxx88`. 
     * @return Bucket Name of the COS bucket bound to a workflow, such as `TopRankVideo-125xxx88`.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set Name of the COS bucket bound to a workflow, such as `TopRankVideo-125xxx88`.
     * @param Bucket Name of the COS bucket bound to a workflow, such as `TopRankVideo-125xxx88`.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get Region of the COS bucket bound to a workflow, such as `ap-chongiqng`. 
     * @return Region Region of the COS bucket bound to a workflow, such as `ap-chongiqng`.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region of the COS bucket bound to a workflow, such as `ap-chongiqng`.
     * @param Region Region of the COS bucket bound to a workflow, such as `ap-chongiqng`.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Input path directory bound to a workflow, such as `/movie/201907/`. If this parameter is left empty, the `/` root directory will be used. 
     * @return Dir Input path directory bound to a workflow, such as `/movie/201907/`. If this parameter is left empty, the `/` root directory will be used.
     */
    public String getDir() {
        return this.Dir;
    }

    /**
     * Set Input path directory bound to a workflow, such as `/movie/201907/`. If this parameter is left empty, the `/` root directory will be used.
     * @param Dir Input path directory bound to a workflow, such as `/movie/201907/`. If this parameter is left empty, the `/` root directory will be used.
     */
    public void setDir(String Dir) {
        this.Dir = Dir;
    }

    /**
     * Get Format list of files that can trigger a workflow, such as ["mp4", "flv", "mov"]. If this parameter is left empty, files in all formats can trigger the workflow. 
     * @return Formats Format list of files that can trigger a workflow, such as ["mp4", "flv", "mov"]. If this parameter is left empty, files in all formats can trigger the workflow.
     */
    public String [] getFormats() {
        return this.Formats;
    }

    /**
     * Set Format list of files that can trigger a workflow, such as ["mp4", "flv", "mov"]. If this parameter is left empty, files in all formats can trigger the workflow.
     * @param Formats Format list of files that can trigger a workflow, such as ["mp4", "flv", "mov"]. If this parameter is left empty, files in all formats can trigger the workflow.
     */
    public void setFormats(String [] Formats) {
        this.Formats = Formats;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Dir", this.Dir);
        this.setParamArraySimple(map, prefix + "Formats.", this.Formats);

    }
}

