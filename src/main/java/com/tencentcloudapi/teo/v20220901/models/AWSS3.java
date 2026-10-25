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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AWSS3 extends AbstractModel {

    /**
    * Service endpoint domain name of the AWS S3 bucket. For valid values, see [AWS Endpoints](https://docs.aws.amazon.com/general/latest/gr/rande.html#regional-endpoints). Example: `s3.us-west-2.amazonaws.com`.
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * <p>Name of the AWS S3 bucket. You can view the bucket name in the Buckets list in the AWS S3 console.</p><p>It must be 3 to 63 characters in length, contain only lowercase letters, digits, periods (.), and hyphens (-), and start and end with a letter or a digit.</p>
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * <p>Directory path where log files are stored in the AWS S3 bucket. Multiple directory levels can be created by separating with `/`. It cannot contain relative path segments such as `./..`, and the total path length cannot exceed 1024 bytes.</p><p>If the directory path exists, it is used directly; if it does not exist, it is automatically created.</p><p>Directory names can only consist of letters, digits, and `!-_.*'()`.</p><p>Example: `eo-logs/l7-access-logs`.</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>ARN of the IAM role that authorizes EdgeOne to access the AWS S3 bucket.</p><p>You need to first create an IAM role in your AWS account that grants EdgeOne write permissions (for how to create it, see <a href="https://www.tencentcloud.com/document/product/1145/56251">Delivering Logs to AWS S3</a>). After creation, you can view and copy the ARN at the top of the role details page in the AWS IAM console.</p><p>Example: `arn:aws:iam::123456789012:role/eo-logs`.</p>
    */
    @SerializedName("RoleARN")
    @Expose
    private String RoleARN;

    /**
    * <p>Data compression type. Valid values:</p><ul><li>`gzip`: gzip compression.</li></ul>If left empty, compression is disabled.
    */
    @SerializedName("CompressType")
    @Expose
    private String CompressType;

    /**
     * Get Service endpoint domain name of the AWS S3 bucket. For valid values, see [AWS Endpoints](https://docs.aws.amazon.com/general/latest/gr/rande.html#regional-endpoints). Example: `s3.us-west-2.amazonaws.com`. 
     * @return Endpoint Service endpoint domain name of the AWS S3 bucket. For valid values, see [AWS Endpoints](https://docs.aws.amazon.com/general/latest/gr/rande.html#regional-endpoints). Example: `s3.us-west-2.amazonaws.com`.
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set Service endpoint domain name of the AWS S3 bucket. For valid values, see [AWS Endpoints](https://docs.aws.amazon.com/general/latest/gr/rande.html#regional-endpoints). Example: `s3.us-west-2.amazonaws.com`.
     * @param Endpoint Service endpoint domain name of the AWS S3 bucket. For valid values, see [AWS Endpoints](https://docs.aws.amazon.com/general/latest/gr/rande.html#regional-endpoints). Example: `s3.us-west-2.amazonaws.com`.
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get <p>Name of the AWS S3 bucket. You can view the bucket name in the Buckets list in the AWS S3 console.</p><p>It must be 3 to 63 characters in length, contain only lowercase letters, digits, periods (.), and hyphens (-), and start and end with a letter or a digit.</p> 
     * @return BucketName <p>Name of the AWS S3 bucket. You can view the bucket name in the Buckets list in the AWS S3 console.</p><p>It must be 3 to 63 characters in length, contain only lowercase letters, digits, periods (.), and hyphens (-), and start and end with a letter or a digit.</p>
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set <p>Name of the AWS S3 bucket. You can view the bucket name in the Buckets list in the AWS S3 console.</p><p>It must be 3 to 63 characters in length, contain only lowercase letters, digits, periods (.), and hyphens (-), and start and end with a letter or a digit.</p>
     * @param BucketName <p>Name of the AWS S3 bucket. You can view the bucket name in the Buckets list in the AWS S3 console.</p><p>It must be 3 to 63 characters in length, contain only lowercase letters, digits, periods (.), and hyphens (-), and start and end with a letter or a digit.</p>
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get <p>Directory path where log files are stored in the AWS S3 bucket. Multiple directory levels can be created by separating with `/`. It cannot contain relative path segments such as `./..`, and the total path length cannot exceed 1024 bytes.</p><p>If the directory path exists, it is used directly; if it does not exist, it is automatically created.</p><p>Directory names can only consist of letters, digits, and `!-_.*'()`.</p><p>Example: `eo-logs/l7-access-logs`.</p> 
     * @return Path <p>Directory path where log files are stored in the AWS S3 bucket. Multiple directory levels can be created by separating with `/`. It cannot contain relative path segments such as `./..`, and the total path length cannot exceed 1024 bytes.</p><p>If the directory path exists, it is used directly; if it does not exist, it is automatically created.</p><p>Directory names can only consist of letters, digits, and `!-_.*'()`.</p><p>Example: `eo-logs/l7-access-logs`.</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>Directory path where log files are stored in the AWS S3 bucket. Multiple directory levels can be created by separating with `/`. It cannot contain relative path segments such as `./..`, and the total path length cannot exceed 1024 bytes.</p><p>If the directory path exists, it is used directly; if it does not exist, it is automatically created.</p><p>Directory names can only consist of letters, digits, and `!-_.*'()`.</p><p>Example: `eo-logs/l7-access-logs`.</p>
     * @param Path <p>Directory path where log files are stored in the AWS S3 bucket. Multiple directory levels can be created by separating with `/`. It cannot contain relative path segments such as `./..`, and the total path length cannot exceed 1024 bytes.</p><p>If the directory path exists, it is used directly; if it does not exist, it is automatically created.</p><p>Directory names can only consist of letters, digits, and `!-_.*'()`.</p><p>Example: `eo-logs/l7-access-logs`.</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>ARN of the IAM role that authorizes EdgeOne to access the AWS S3 bucket.</p><p>You need to first create an IAM role in your AWS account that grants EdgeOne write permissions (for how to create it, see <a href="https://www.tencentcloud.com/document/product/1145/56251">Delivering Logs to AWS S3</a>). After creation, you can view and copy the ARN at the top of the role details page in the AWS IAM console.</p><p>Example: `arn:aws:iam::123456789012:role/eo-logs`.</p> 
     * @return RoleARN <p>ARN of the IAM role that authorizes EdgeOne to access the AWS S3 bucket.</p><p>You need to first create an IAM role in your AWS account that grants EdgeOne write permissions (for how to create it, see <a href="https://www.tencentcloud.com/document/product/1145/56251">Delivering Logs to AWS S3</a>). After creation, you can view and copy the ARN at the top of the role details page in the AWS IAM console.</p><p>Example: `arn:aws:iam::123456789012:role/eo-logs`.</p>
     */
    public String getRoleARN() {
        return this.RoleARN;
    }

    /**
     * Set <p>ARN of the IAM role that authorizes EdgeOne to access the AWS S3 bucket.</p><p>You need to first create an IAM role in your AWS account that grants EdgeOne write permissions (for how to create it, see <a href="https://www.tencentcloud.com/document/product/1145/56251">Delivering Logs to AWS S3</a>). After creation, you can view and copy the ARN at the top of the role details page in the AWS IAM console.</p><p>Example: `arn:aws:iam::123456789012:role/eo-logs`.</p>
     * @param RoleARN <p>ARN of the IAM role that authorizes EdgeOne to access the AWS S3 bucket.</p><p>You need to first create an IAM role in your AWS account that grants EdgeOne write permissions (for how to create it, see <a href="https://www.tencentcloud.com/document/product/1145/56251">Delivering Logs to AWS S3</a>). After creation, you can view and copy the ARN at the top of the role details page in the AWS IAM console.</p><p>Example: `arn:aws:iam::123456789012:role/eo-logs`.</p>
     */
    public void setRoleARN(String RoleARN) {
        this.RoleARN = RoleARN;
    }

    /**
     * Get <p>Data compression type. Valid values:</p><ul><li>`gzip`: gzip compression.</li></ul>If left empty, compression is disabled. 
     * @return CompressType <p>Data compression type. Valid values:</p><ul><li>`gzip`: gzip compression.</li></ul>If left empty, compression is disabled.
     */
    public String getCompressType() {
        return this.CompressType;
    }

    /**
     * Set <p>Data compression type. Valid values:</p><ul><li>`gzip`: gzip compression.</li></ul>If left empty, compression is disabled.
     * @param CompressType <p>Data compression type. Valid values:</p><ul><li>`gzip`: gzip compression.</li></ul>If left empty, compression is disabled.
     */
    public void setCompressType(String CompressType) {
        this.CompressType = CompressType;
    }

    public AWSS3() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AWSS3(AWSS3 source) {
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.RoleARN != null) {
            this.RoleARN = new String(source.RoleARN);
        }
        if (source.CompressType != null) {
            this.CompressType = new String(source.CompressType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "RoleARN", this.RoleARN);
        this.setParamSimple(map, prefix + "CompressType", this.CompressType);

    }
}

