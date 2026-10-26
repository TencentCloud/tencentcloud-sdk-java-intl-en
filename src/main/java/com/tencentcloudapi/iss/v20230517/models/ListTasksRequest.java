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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListTasksRequest extends AbstractModel {

    /**
    * Page number, which is 1 by default.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of items per page. The default value is 20.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Default: do not filter by this field. Otherwise, filter by device operation type. Current values: BatchDeleteUserDevice, BatchDisableDevice, BatchEnableDevice.
BatchUpgradeDevice,
BatchResetDevice,
BatchRebootDevice,
BatchRefreshDeviceChannel
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * By default, filtering is not based on this field. Otherwise, filter by task status. Status code: 1 - Pending, 2 - Executing, 3 - Completed, 4 - Cancelled.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Start time.
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * End time.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get Page number, which is 1 by default. 
     * @return PageNumber Page number, which is 1 by default.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number, which is 1 by default.
     * @param PageNumber Page number, which is 1 by default.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of items per page. The default value is 20. 
     * @return PageSize Number of items per page. The default value is 20.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of items per page. The default value is 20.
     * @param PageSize Number of items per page. The default value is 20.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Default: do not filter by this field. Otherwise, filter by device operation type. Current values: BatchDeleteUserDevice, BatchDisableDevice, BatchEnableDevice.
BatchUpgradeDevice,
BatchResetDevice,
BatchRebootDevice,
BatchRefreshDeviceChannel 
     * @return Operation Default: do not filter by this field. Otherwise, filter by device operation type. Current values: BatchDeleteUserDevice, BatchDisableDevice, BatchEnableDevice.
BatchUpgradeDevice,
BatchResetDevice,
BatchRebootDevice,
BatchRefreshDeviceChannel
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Default: do not filter by this field. Otherwise, filter by device operation type. Current values: BatchDeleteUserDevice, BatchDisableDevice, BatchEnableDevice.
BatchUpgradeDevice,
BatchResetDevice,
BatchRebootDevice,
BatchRefreshDeviceChannel
     * @param Operation Default: do not filter by this field. Otherwise, filter by device operation type. Current values: BatchDeleteUserDevice, BatchDisableDevice, BatchEnableDevice.
BatchUpgradeDevice,
BatchResetDevice,
BatchRebootDevice,
BatchRefreshDeviceChannel
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get By default, filtering is not based on this field. Otherwise, filter by task status. Status code: 1 - Pending, 2 - Executing, 3 - Completed, 4 - Cancelled. 
     * @return Status By default, filtering is not based on this field. Otherwise, filter by task status. Status code: 1 - Pending, 2 - Executing, 3 - Completed, 4 - Cancelled.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set By default, filtering is not based on this field. Otherwise, filter by task status. Status code: 1 - Pending, 2 - Executing, 3 - Completed, 4 - Cancelled.
     * @param Status By default, filtering is not based on this field. Otherwise, filter by task status. Status code: 1 - Pending, 2 - Executing, 3 - Completed, 4 - Cancelled.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Start time. 
     * @return BeginTime Start time.
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Start time.
     * @param BeginTime Start time.
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get End time. 
     * @return EndTime End time.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.
     * @param EndTime End time.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public ListTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTasksRequest(ListTasksRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

