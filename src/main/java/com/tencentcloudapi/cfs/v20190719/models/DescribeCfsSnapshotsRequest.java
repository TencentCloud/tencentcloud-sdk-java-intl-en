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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCfsSnapshotsRequest extends AbstractModel {

    /**
    * File system ID, which can be obtained by querying the file system through the [DescribeCfsFileSystems](https://www.tencentcloud.com/document/product/582/38170?from_cn_redirect=1) api.
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * Snapshot ID.
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * Paging start position, defaults to 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Page length. default value 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter criteria
SnapshotId - Array of String - required: no - (filter condition) filter by snapshot ID.
<br>SnapshotName - Array of String - required: no - (filter condition) filter by snapshot name.
<br>FileSystemId - Array of String - required: no - (filter condition) filter by file system ID.
<br>FsName - Array of String - required: no - (filtering conditions) filters file system names.
<br>Status - Array of String - required: no - (filter criteria) filter by snapshot Status. Status classification: creating: under creation | available: running | deleting: deleting | rollbacking_new: being created for new file system | create-failed: creation failed.
<br>tag-key - Array of String - required: no - (filter condition) filter by tag key.
<br>tag:tag-key - Array of String - required: no - (filter condition) filter by tag key-value pair. replace tag-key with a specific tag key.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Sort by creation time to obtain value.
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * Sorting order; ascending or descending order.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get File system ID, which can be obtained by querying the file system through the [DescribeCfsFileSystems](https://www.tencentcloud.com/document/product/582/38170?from_cn_redirect=1) api. 
     * @return FileSystemId File system ID, which can be obtained by querying the file system through the [DescribeCfsFileSystems](https://www.tencentcloud.com/document/product/582/38170?from_cn_redirect=1) api.
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set File system ID, which can be obtained by querying the file system through the [DescribeCfsFileSystems](https://www.tencentcloud.com/document/product/582/38170?from_cn_redirect=1) api.
     * @param FileSystemId File system ID, which can be obtained by querying the file system through the [DescribeCfsFileSystems](https://www.tencentcloud.com/document/product/582/38170?from_cn_redirect=1) api.
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get Snapshot ID. 
     * @return SnapshotId Snapshot ID.
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set Snapshot ID.
     * @param SnapshotId Snapshot ID.
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get Paging start position, defaults to 0. 
     * @return Offset Paging start position, defaults to 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Paging start position, defaults to 0.
     * @param Offset Paging start position, defaults to 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Page length. default value 20. 
     * @return Limit Page length. default value 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Page length. default value 20.
     * @param Limit Page length. default value 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter criteria
SnapshotId - Array of String - required: no - (filter condition) filter by snapshot ID.
<br>SnapshotName - Array of String - required: no - (filter condition) filter by snapshot name.
<br>FileSystemId - Array of String - required: no - (filter condition) filter by file system ID.
<br>FsName - Array of String - required: no - (filtering conditions) filters file system names.
<br>Status - Array of String - required: no - (filter criteria) filter by snapshot Status. Status classification: creating: under creation | available: running | deleting: deleting | rollbacking_new: being created for new file system | create-failed: creation failed.
<br>tag-key - Array of String - required: no - (filter condition) filter by tag key.
<br>tag:tag-key - Array of String - required: no - (filter condition) filter by tag key-value pair. replace tag-key with a specific tag key. 
     * @return Filters Filter criteria
SnapshotId - Array of String - required: no - (filter condition) filter by snapshot ID.
<br>SnapshotName - Array of String - required: no - (filter condition) filter by snapshot name.
<br>FileSystemId - Array of String - required: no - (filter condition) filter by file system ID.
<br>FsName - Array of String - required: no - (filtering conditions) filters file system names.
<br>Status - Array of String - required: no - (filter criteria) filter by snapshot Status. Status classification: creating: under creation | available: running | deleting: deleting | rollbacking_new: being created for new file system | create-failed: creation failed.
<br>tag-key - Array of String - required: no - (filter condition) filter by tag key.
<br>tag:tag-key - Array of String - required: no - (filter condition) filter by tag key-value pair. replace tag-key with a specific tag key.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
SnapshotId - Array of String - required: no - (filter condition) filter by snapshot ID.
<br>SnapshotName - Array of String - required: no - (filter condition) filter by snapshot name.
<br>FileSystemId - Array of String - required: no - (filter condition) filter by file system ID.
<br>FsName - Array of String - required: no - (filtering conditions) filters file system names.
<br>Status - Array of String - required: no - (filter criteria) filter by snapshot Status. Status classification: creating: under creation | available: running | deleting: deleting | rollbacking_new: being created for new file system | create-failed: creation failed.
<br>tag-key - Array of String - required: no - (filter condition) filter by tag key.
<br>tag:tag-key - Array of String - required: no - (filter condition) filter by tag key-value pair. replace tag-key with a specific tag key.
     * @param Filters Filter criteria
SnapshotId - Array of String - required: no - (filter condition) filter by snapshot ID.
<br>SnapshotName - Array of String - required: no - (filter condition) filter by snapshot name.
<br>FileSystemId - Array of String - required: no - (filter condition) filter by file system ID.
<br>FsName - Array of String - required: no - (filtering conditions) filters file system names.
<br>Status - Array of String - required: no - (filter criteria) filter by snapshot Status. Status classification: creating: under creation | available: running | deleting: deleting | rollbacking_new: being created for new file system | create-failed: creation failed.
<br>tag-key - Array of String - required: no - (filter condition) filter by tag key.
<br>tag:tag-key - Array of String - required: no - (filter condition) filter by tag key-value pair. replace tag-key with a specific tag key.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sort by creation time to obtain value. 
     * @return OrderField Sort by creation time to obtain value.
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set Sort by creation time to obtain value.
     * @param OrderField Sort by creation time to obtain value.
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get Sorting order; ascending or descending order. 
     * @return Order Sorting order; ascending or descending order.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting order; ascending or descending order.
     * @param Order Sorting order; ascending or descending order.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeCfsSnapshotsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCfsSnapshotsRequest(DescribeCfsSnapshotsRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

