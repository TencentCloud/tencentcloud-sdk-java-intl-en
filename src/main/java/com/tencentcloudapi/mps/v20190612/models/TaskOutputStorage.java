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

public class TaskOutputStorage extends AbstractModel {

    /**
    * Type of the media processing output object storage location. Supported values:
<li>COS: COS storage</li>
<li>AWS-S3: AWS storage, suitable for AWS tasks only and requires the same region</li>
<li> VOD: VOD Pro Edition </li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("CosOutputStorage")
    @Expose
    private CosOutputStorage CosOutputStorage;

    /**
    * 
    */
    @SerializedName("S3OutputStorage")
    @Expose
    private S3OutputStorage S3OutputStorage;

    /**
    * 
    */
    @SerializedName("VODOutputStorage")
    @Expose
    private VODOutputStorage VODOutputStorage;

    /**
     * Get Type of the media processing output object storage location. Supported values:
<li>COS: COS storage</li>
<li>AWS-S3: AWS storage, suitable for AWS tasks only and requires the same region</li>
<li> VOD: VOD Pro Edition </li> 
     * @return Type Type of the media processing output object storage location. Supported values:
<li>COS: COS storage</li>
<li>AWS-S3: AWS storage, suitable for AWS tasks only and requires the same region</li>
<li> VOD: VOD Pro Edition </li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of the media processing output object storage location. Supported values:
<li>COS: COS storage</li>
<li>AWS-S3: AWS storage, suitable for AWS tasks only and requires the same region</li>
<li> VOD: VOD Pro Edition </li>
     * @param Type Type of the media processing output object storage location. Supported values:
<li>COS: COS storage</li>
<li>AWS-S3: AWS storage, suitable for AWS tasks only and requires the same region</li>
<li> VOD: VOD Pro Edition </li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return CosOutputStorage 
     */
    public CosOutputStorage getCosOutputStorage() {
        return this.CosOutputStorage;
    }

    /**
     * Set 
     * @param CosOutputStorage 
     */
    public void setCosOutputStorage(CosOutputStorage CosOutputStorage) {
        this.CosOutputStorage = CosOutputStorage;
    }

    /**
     * Get  
     * @return S3OutputStorage 
     */
    public S3OutputStorage getS3OutputStorage() {
        return this.S3OutputStorage;
    }

    /**
     * Set 
     * @param S3OutputStorage 
     */
    public void setS3OutputStorage(S3OutputStorage S3OutputStorage) {
        this.S3OutputStorage = S3OutputStorage;
    }

    /**
     * Get  
     * @return VODOutputStorage 
     */
    public VODOutputStorage getVODOutputStorage() {
        return this.VODOutputStorage;
    }

    /**
     * Set 
     * @param VODOutputStorage 
     */
    public void setVODOutputStorage(VODOutputStorage VODOutputStorage) {
        this.VODOutputStorage = VODOutputStorage;
    }

    public TaskOutputStorage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskOutputStorage(TaskOutputStorage source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CosOutputStorage != null) {
            this.CosOutputStorage = new CosOutputStorage(source.CosOutputStorage);
        }
        if (source.S3OutputStorage != null) {
            this.S3OutputStorage = new S3OutputStorage(source.S3OutputStorage);
        }
        if (source.VODOutputStorage != null) {
            this.VODOutputStorage = new VODOutputStorage(source.VODOutputStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "CosOutputStorage.", this.CosOutputStorage);
        this.setParamObj(map, prefix + "S3OutputStorage.", this.S3OutputStorage);
        this.setParamObj(map, prefix + "VODOutputStorage.", this.VODOutputStorage);

    }
}

