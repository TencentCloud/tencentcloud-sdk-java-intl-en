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

public class LifecycleRule extends AbstractModel {

    /**
    * Storage type after data dump. among them: InfrequentAccess: infrequent medium storage; ColdStorage: cold storage.
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * Data dump FILE type. among them, BIG_FILE: extra large FILE; STD_FILE: regular FILE; SMALL_FILE: SMALL FILE; ALL: ALL files.
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * Data dumping action. among them, Archive: settlement; Noarchive: no settlement.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Data dump trigger time. consists of "DEFAULT_ATIME_" and a number, in days. keep it empty when Action is Noarchive.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Maximum specification for data dump files. the value needs to use the "number+measurement unit" format, and the supported units are K (KiB), M (MiB), and G (GiB).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileMaxSize")
    @Expose
    private String FileMaxSize;

    /**
    * Minimum specification of the dump file. its numeric value needs to use the "number+measurement unit" format, and the supported units are K (KiB), M (MiB), and G (GiB).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileMinSize")
    @Expose
    private String FileMinSize;

    /**
    * Policy type.
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * Threshold range: 10-90.
    */
    @SerializedName("ExpireThreshold")
    @Expose
    private Long ExpireThreshold;

    /**
    * Threshold range: 10-90.
    */
    @SerializedName("TargetThreshold")
    @Expose
    private Long TargetThreshold;

    /**
    * When a file in CFSTurbo and an external storage have the same name, whether to overwrite.

Override.

false: not overwrite (at the same time will not release hot data storage).

Default false when empty.
    */
    @SerializedName("IsOverwrite")
    @Expose
    private Boolean IsOverwrite;

    /**
     * Get Storage type after data dump. among them: InfrequentAccess: infrequent medium storage; ColdStorage: cold storage. 
     * @return StorageType Storage type after data dump. among them: InfrequentAccess: infrequent medium storage; ColdStorage: cold storage.
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Storage type after data dump. among them: InfrequentAccess: infrequent medium storage; ColdStorage: cold storage.
     * @param StorageType Storage type after data dump. among them: InfrequentAccess: infrequent medium storage; ColdStorage: cold storage.
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get Data dump FILE type. among them, BIG_FILE: extra large FILE; STD_FILE: regular FILE; SMALL_FILE: SMALL FILE; ALL: ALL files. 
     * @return FileType Data dump FILE type. among them, BIG_FILE: extra large FILE; STD_FILE: regular FILE; SMALL_FILE: SMALL FILE; ALL: ALL files.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set Data dump FILE type. among them, BIG_FILE: extra large FILE; STD_FILE: regular FILE; SMALL_FILE: SMALL FILE; ALL: ALL files.
     * @param FileType Data dump FILE type. among them, BIG_FILE: extra large FILE; STD_FILE: regular FILE; SMALL_FILE: SMALL FILE; ALL: ALL files.
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get Data dumping action. among them, Archive: settlement; Noarchive: no settlement. 
     * @return Action Data dumping action. among them, Archive: settlement; Noarchive: no settlement.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Data dumping action. among them, Archive: settlement; Noarchive: no settlement.
     * @param Action Data dumping action. among them, Archive: settlement; Noarchive: no settlement.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Data dump trigger time. consists of "DEFAULT_ATIME_" and a number, in days. keep it empty when Action is Noarchive.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Interval Data dump trigger time. consists of "DEFAULT_ATIME_" and a number, in days. keep it empty when Action is Noarchive.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Data dump trigger time. consists of "DEFAULT_ATIME_" and a number, in days. keep it empty when Action is Noarchive.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Interval Data dump trigger time. consists of "DEFAULT_ATIME_" and a number, in days. keep it empty when Action is Noarchive.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Maximum specification for data dump files. the value needs to use the "number+measurement unit" format, and the supported units are K (KiB), M (MiB), and G (GiB).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileMaxSize Maximum specification for data dump files. the value needs to use the "number+measurement unit" format, and the supported units are K (KiB), M (MiB), and G (GiB).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFileMaxSize() {
        return this.FileMaxSize;
    }

    /**
     * Set Maximum specification for data dump files. the value needs to use the "number+measurement unit" format, and the supported units are K (KiB), M (MiB), and G (GiB).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileMaxSize Maximum specification for data dump files. the value needs to use the "number+measurement unit" format, and the supported units are K (KiB), M (MiB), and G (GiB).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileMaxSize(String FileMaxSize) {
        this.FileMaxSize = FileMaxSize;
    }

    /**
     * Get Minimum specification of the dump file. its numeric value needs to use the "number+measurement unit" format, and the supported units are K (KiB), M (MiB), and G (GiB).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileMinSize Minimum specification of the dump file. its numeric value needs to use the "number+measurement unit" format, and the supported units are K (KiB), M (MiB), and G (GiB).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFileMinSize() {
        return this.FileMinSize;
    }

    /**
     * Set Minimum specification of the dump file. its numeric value needs to use the "number+measurement unit" format, and the supported units are K (KiB), M (MiB), and G (GiB).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileMinSize Minimum specification of the dump file. its numeric value needs to use the "number+measurement unit" format, and the supported units are K (KiB), M (MiB), and G (GiB).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileMinSize(String FileMinSize) {
        this.FileMinSize = FileMinSize;
    }

    /**
     * Get Policy type. 
     * @return PolicyType Policy type.
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set Policy type.
     * @param PolicyType Policy type.
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get Threshold range: 10-90. 
     * @return ExpireThreshold Threshold range: 10-90.
     */
    public Long getExpireThreshold() {
        return this.ExpireThreshold;
    }

    /**
     * Set Threshold range: 10-90.
     * @param ExpireThreshold Threshold range: 10-90.
     */
    public void setExpireThreshold(Long ExpireThreshold) {
        this.ExpireThreshold = ExpireThreshold;
    }

    /**
     * Get Threshold range: 10-90. 
     * @return TargetThreshold Threshold range: 10-90.
     */
    public Long getTargetThreshold() {
        return this.TargetThreshold;
    }

    /**
     * Set Threshold range: 10-90.
     * @param TargetThreshold Threshold range: 10-90.
     */
    public void setTargetThreshold(Long TargetThreshold) {
        this.TargetThreshold = TargetThreshold;
    }

    /**
     * Get When a file in CFSTurbo and an external storage have the same name, whether to overwrite.

Override.

false: not overwrite (at the same time will not release hot data storage).

Default false when empty. 
     * @return IsOverwrite When a file in CFSTurbo and an external storage have the same name, whether to overwrite.

Override.

false: not overwrite (at the same time will not release hot data storage).

Default false when empty.
     */
    public Boolean getIsOverwrite() {
        return this.IsOverwrite;
    }

    /**
     * Set When a file in CFSTurbo and an external storage have the same name, whether to overwrite.

Override.

false: not overwrite (at the same time will not release hot data storage).

Default false when empty.
     * @param IsOverwrite When a file in CFSTurbo and an external storage have the same name, whether to overwrite.

Override.

false: not overwrite (at the same time will not release hot data storage).

Default false when empty.
     */
    public void setIsOverwrite(Boolean IsOverwrite) {
        this.IsOverwrite = IsOverwrite;
    }

    public LifecycleRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LifecycleRule(LifecycleRule source) {
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.FileMaxSize != null) {
            this.FileMaxSize = new String(source.FileMaxSize);
        }
        if (source.FileMinSize != null) {
            this.FileMinSize = new String(source.FileMinSize);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.ExpireThreshold != null) {
            this.ExpireThreshold = new Long(source.ExpireThreshold);
        }
        if (source.TargetThreshold != null) {
            this.TargetThreshold = new Long(source.TargetThreshold);
        }
        if (source.IsOverwrite != null) {
            this.IsOverwrite = new Boolean(source.IsOverwrite);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "FileMaxSize", this.FileMaxSize);
        this.setParamSimple(map, prefix + "FileMinSize", this.FileMinSize);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "ExpireThreshold", this.ExpireThreshold);
        this.setParamSimple(map, prefix + "TargetThreshold", this.TargetThreshold);
        this.setParamSimple(map, prefix + "IsOverwrite", this.IsOverwrite);

    }
}

