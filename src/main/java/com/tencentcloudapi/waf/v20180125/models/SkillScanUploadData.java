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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkillScanUploadData extends AbstractModel {

    /**
    * <p>SHA256 Hash of the file, used for polling query APIs.</p>
    */
    @SerializedName("ContentHash")
    @Expose
    private String ContentHash;

    /**
    * <p>Fixed value: scanning. Indicates that the task has been received.</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Readable description of the operation result.</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get <p>SHA256 Hash of the file, used for polling query APIs.</p> 
     * @return ContentHash <p>SHA256 Hash of the file, used for polling query APIs.</p>
     */
    public String getContentHash() {
        return this.ContentHash;
    }

    /**
     * Set <p>SHA256 Hash of the file, used for polling query APIs.</p>
     * @param ContentHash <p>SHA256 Hash of the file, used for polling query APIs.</p>
     */
    public void setContentHash(String ContentHash) {
        this.ContentHash = ContentHash;
    }

    /**
     * Get <p>Fixed value: scanning. Indicates that the task has been received.</p> 
     * @return Status <p>Fixed value: scanning. Indicates that the task has been received.</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Fixed value: scanning. Indicates that the task has been received.</p>
     * @param Status <p>Fixed value: scanning. Indicates that the task has been received.</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Readable description of the operation result.</p> 
     * @return Message <p>Readable description of the operation result.</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>Readable description of the operation result.</p>
     * @param Message <p>Readable description of the operation result.</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public SkillScanUploadData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillScanUploadData(SkillScanUploadData source) {
        if (source.ContentHash != null) {
            this.ContentHash = new String(source.ContentHash);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContentHash", this.ContentHash);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

