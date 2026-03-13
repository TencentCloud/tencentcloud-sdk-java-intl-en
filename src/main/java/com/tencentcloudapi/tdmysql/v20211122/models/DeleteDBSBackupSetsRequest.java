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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDBSBackupSetsRequest extends AbstractModel {

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Backup set list. the value comes from the DescribeDBSBackupSets api response.</p>
    */
    @SerializedName("BackupSetIdList")
    @Expose
    private Long [] BackupSetIdList;

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Backup set list. the value comes from the DescribeDBSBackupSets api response.</p> 
     * @return BackupSetIdList <p>Backup set list. the value comes from the DescribeDBSBackupSets api response.</p>
     */
    public Long [] getBackupSetIdList() {
        return this.BackupSetIdList;
    }

    /**
     * Set <p>Backup set list. the value comes from the DescribeDBSBackupSets api response.</p>
     * @param BackupSetIdList <p>Backup set list. the value comes from the DescribeDBSBackupSets api response.</p>
     */
    public void setBackupSetIdList(Long [] BackupSetIdList) {
        this.BackupSetIdList = BackupSetIdList;
    }

    public DeleteDBSBackupSetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDBSBackupSetsRequest(DeleteDBSBackupSetsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupSetIdList != null) {
            this.BackupSetIdList = new Long[source.BackupSetIdList.length];
            for (int i = 0; i < source.BackupSetIdList.length; i++) {
                this.BackupSetIdList[i] = new Long(source.BackupSetIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "BackupSetIdList.", this.BackupSetIdList);

    }
}

