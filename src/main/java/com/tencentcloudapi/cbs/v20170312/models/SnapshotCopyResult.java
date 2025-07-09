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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotCopyResult extends AbstractModel {

    /**
    * ID of the snapshot replica
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * Error message. It’s null if the request succeeds.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Error code. It’s `Success` if the request succeeds.
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * Destination region of the replication task
    */
    @SerializedName("DestinationRegion")
    @Expose
    private String DestinationRegion;

    /**
     * Get ID of the snapshot replica 
     * @return SnapshotId ID of the snapshot replica
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set ID of the snapshot replica
     * @param SnapshotId ID of the snapshot replica
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get Error message. It’s null if the request succeeds. 
     * @return Message Error message. It’s null if the request succeeds.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error message. It’s null if the request succeeds.
     * @param Message Error message. It’s null if the request succeeds.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Error code. It’s `Success` if the request succeeds. 
     * @return Code Error code. It’s `Success` if the request succeeds.
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set Error code. It’s `Success` if the request succeeds.
     * @param Code Error code. It’s `Success` if the request succeeds.
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get Destination region of the replication task 
     * @return DestinationRegion Destination region of the replication task
     */
    public String getDestinationRegion() {
        return this.DestinationRegion;
    }

    /**
     * Set Destination region of the replication task
     * @param DestinationRegion Destination region of the replication task
     */
    public void setDestinationRegion(String DestinationRegion) {
        this.DestinationRegion = DestinationRegion;
    }

    public SnapshotCopyResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotCopyResult(SnapshotCopyResult source) {
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.DestinationRegion != null) {
            this.DestinationRegion = new String(source.DestinationRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "DestinationRegion", this.DestinationRegion);

    }
}

