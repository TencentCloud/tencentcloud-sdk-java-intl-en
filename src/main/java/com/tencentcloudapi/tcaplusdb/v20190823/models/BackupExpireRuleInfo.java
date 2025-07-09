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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupExpireRuleInfo extends AbstractModel {

    /**
    * The ID of the table group where the table resides
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * Table name
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * file tag, which is described above.
    */
    @SerializedName("FileTag")
    @Expose
    private Long FileTag;

    /**
    * Retention days, which is described above.
    */
    @SerializedName("ExpireDay")
    @Expose
    private Long ExpireDay;

    /**
    * Operation type, which is described above.
    */
    @SerializedName("OperType")
    @Expose
    private Long OperType;

    /**
     * Get The ID of the table group where the table resides 
     * @return TableGroupId The ID of the table group where the table resides
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set The ID of the table group where the table resides
     * @param TableGroupId The ID of the table group where the table resides
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get Table name 
     * @return TableName Table name
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table name
     * @param TableName Table name
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get file tag, which is described above. 
     * @return FileTag file tag, which is described above.
     */
    public Long getFileTag() {
        return this.FileTag;
    }

    /**
     * Set file tag, which is described above.
     * @param FileTag file tag, which is described above.
     */
    public void setFileTag(Long FileTag) {
        this.FileTag = FileTag;
    }

    /**
     * Get Retention days, which is described above. 
     * @return ExpireDay Retention days, which is described above.
     */
    public Long getExpireDay() {
        return this.ExpireDay;
    }

    /**
     * Set Retention days, which is described above.
     * @param ExpireDay Retention days, which is described above.
     */
    public void setExpireDay(Long ExpireDay) {
        this.ExpireDay = ExpireDay;
    }

    /**
     * Get Operation type, which is described above. 
     * @return OperType Operation type, which is described above.
     */
    public Long getOperType() {
        return this.OperType;
    }

    /**
     * Set Operation type, which is described above.
     * @param OperType Operation type, which is described above.
     */
    public void setOperType(Long OperType) {
        this.OperType = OperType;
    }

    public BackupExpireRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupExpireRuleInfo(BackupExpireRuleInfo source) {
        if (source.TableGroupId != null) {
            this.TableGroupId = new String(source.TableGroupId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.FileTag != null) {
            this.FileTag = new Long(source.FileTag);
        }
        if (source.ExpireDay != null) {
            this.ExpireDay = new Long(source.ExpireDay);
        }
        if (source.OperType != null) {
            this.OperType = new Long(source.OperType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "FileTag", this.FileTag);
        this.setParamSimple(map, prefix + "ExpireDay", this.ExpireDay);
        this.setParamSimple(map, prefix + "OperType", this.OperType);

    }
}

