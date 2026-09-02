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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDspmBackupLogListRequest extends AbstractModel {

    /**
    * <p>Number limit.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Offset.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Sorting method (desc = descending order, asc = ascending order)</p>
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * <p>Sorting field (supports 'StartTime')</p>
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * <p>Start time.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>End time.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>Backup log status. 0: incomplete; 1: backup file; 2: recovering; 3: restored; 4: deleted; -1: full query.</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Database type, for example: cdb, mariadb</p>
    */
    @SerializedName("DbTypes")
    @Expose
    private String [] DbTypes;

    /**
     * Get <p>Number limit.</p> 
     * @return Limit <p>Number limit.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number limit.</p>
     * @param Limit <p>Number limit.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Offset.</p> 
     * @return Offset <p>Offset.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset.</p>
     * @param Offset <p>Offset.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Sorting method (desc = descending order, asc = ascending order)</p> 
     * @return Sort <p>Sorting method (desc = descending order, asc = ascending order)</p>
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set <p>Sorting method (desc = descending order, asc = ascending order)</p>
     * @param Sort <p>Sorting method (desc = descending order, asc = ascending order)</p>
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <p>Sorting field (supports 'StartTime')</p> 
     * @return Field <p>Sorting field (supports 'StartTime')</p>
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set <p>Sorting field (supports 'StartTime')</p>
     * @param Field <p>Sorting field (supports 'StartTime')</p>
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get <p>Start time.</p> 
     * @return StartTime <p>Start time.</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start time.</p>
     * @param StartTime <p>Start time.</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>End time.</p> 
     * @return EndTime <p>End time.</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time.</p>
     * @param EndTime <p>End time.</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Backup log status. 0: incomplete; 1: backup file; 2: recovering; 3: restored; 4: deleted; -1: full query.</p> 
     * @return Status <p>Backup log status. 0: incomplete; 1: backup file; 2: recovering; 3: restored; 4: deleted; -1: full query.</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Backup log status. 0: incomplete; 1: backup file; 2: recovering; 3: restored; 4: deleted; -1: full query.</p>
     * @param Status <p>Backup log status. 0: incomplete; 1: backup file; 2: recovering; 3: restored; 4: deleted; -1: full query.</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Database type, for example: cdb, mariadb</p> 
     * @return DbTypes <p>Database type, for example: cdb, mariadb</p>
     */
    public String [] getDbTypes() {
        return this.DbTypes;
    }

    /**
     * Set <p>Database type, for example: cdb, mariadb</p>
     * @param DbTypes <p>Database type, for example: cdb, mariadb</p>
     */
    public void setDbTypes(String [] DbTypes) {
        this.DbTypes = DbTypes;
    }

    public DescribeDspmBackupLogListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmBackupLogListRequest(DescribeDspmBackupLogListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.DbTypes != null) {
            this.DbTypes = new String[source.DbTypes.length];
            for (int i = 0; i < source.DbTypes.length; i++) {
                this.DbTypes[i] = new String(source.DbTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "DbTypes.", this.DbTypes);

    }
}

