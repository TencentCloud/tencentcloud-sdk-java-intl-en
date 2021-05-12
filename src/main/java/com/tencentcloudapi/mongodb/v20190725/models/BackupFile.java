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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupFile extends AbstractModel{

    /**
    * ID of the replica set/shard to which a backup file belongs
    */
    @SerializedName("ReplicateSetId")
    @Expose
    private String ReplicateSetId;

    /**
    * Path to a backup file
    */
    @SerializedName("File")
    @Expose
    private String File;

    /**
     * Get ID of the replica set/shard to which a backup file belongs 
     * @return ReplicateSetId ID of the replica set/shard to which a backup file belongs
     */
    public String getReplicateSetId() {
        return this.ReplicateSetId;
    }

    /**
     * Set ID of the replica set/shard to which a backup file belongs
     * @param ReplicateSetId ID of the replica set/shard to which a backup file belongs
     */
    public void setReplicateSetId(String ReplicateSetId) {
        this.ReplicateSetId = ReplicateSetId;
    }

    /**
     * Get Path to a backup file 
     * @return File Path to a backup file
     */
    public String getFile() {
        return this.File;
    }

    /**
     * Set Path to a backup file
     * @param File Path to a backup file
     */
    public void setFile(String File) {
        this.File = File;
    }

    public BackupFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupFile(BackupFile source) {
        if (source.ReplicateSetId != null) {
            this.ReplicateSetId = new String(source.ReplicateSetId);
        }
        if (source.File != null) {
            this.File = new String(source.File);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplicateSetId", this.ReplicateSetId);
        this.setParamSimple(map, prefix + "File", this.File);

    }
}

