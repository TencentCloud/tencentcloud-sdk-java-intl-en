package com.tencentcloudapi.integration.requests;

import com.tencentcloudapi.cbs.v20170312.CbsClient;
import com.tencentcloudapi.cbs.v20170312.models.DescribeSnapshotsRequest;
import com.tencentcloudapi.cbs.v20170312.models.Filter;
import com.tencentcloudapi.cbs.v20170312.models.ModifySnapshotAttributeRequest;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.cvm.v20170312.CvmClient;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesRequest;
import com.tencentcloudapi.iai.v20200303.IaiClient;
import com.tencentcloudapi.iai.v20200303.models.SearchFacesRequest;
import org.junit.Test;

public class DataTypeTest {
    @Test
    public void TestLong() throws TencentCloudSDKException {
        Credential cred = new Credential(
                System.getenv("TENCENTCLOUD_SECRET_ID"),
                System.getenv("TENCENTCLOUD_SECRET_KEY")
        );

        CvmClient client = new CvmClient(cred, "ap-guangzhou");
        DescribeInstancesRequest req = new DescribeInstancesRequest();
        req.setLimit(1L);
        client.DescribeInstances(req);
    }

    @Test
    public void TestUintAndStringAndNestType() throws TencentCloudSDKException {
        Credential cred = new Credential(
                System.getenv("TENCENTCLOUD_SECRET_ID"),
                System.getenv("TENCENTCLOUD_SECRET_KEY")
        );

        CbsClient client = new CbsClient(cred, "ap-guangzhou");
        DescribeSnapshotsRequest req = new DescribeSnapshotsRequest();
        Filter filter = new Filter();
        filter.setName("snapshot-name");
        filter.setValues(new String[]{});
        Filter filter2 = new Filter();
        filter2.setName("snapshot-id");
        filter2.setValues(new String[]{});
        req.setFilters(new Filter[]{filter, filter2});
        req.setLimit(1L);

        try {
            client.DescribeSnapshots(req);
            throw new RuntimeException("unexpected success");
        } catch (TencentCloudSDKException e) {
            if (!e.getErrorCode().contains("InvalidParameter")) {
                throw new RuntimeException("unexpected error", e);
            }
        }
    }

    @Test
    public void TestBoolAndDatetimeIsoType() {
        Credential cred = new Credential(
                System.getenv("TENCENTCLOUD_SECRET_ID"),
                System.getenv("TENCENTCLOUD_SECRET_KEY")
        );

        CbsClient client = new CbsClient(cred, "ap-guangzhou");
        ModifySnapshotAttributeRequest req = new ModifySnapshotAttributeRequest();
        req.setSnapshotId("");
        req.setSnapshotName("");
        req.setIsPermanent(false);
        req.setDeadline("2021-05-22T09:00:00Z");

        try {
            client.ModifySnapshotAttribute(req);
            throw new RuntimeException("unexpected success");
        } catch (TencentCloudSDKException e) {
            if (!e.getErrorCode().contains("InvalidParameter")) {
                throw new RuntimeException("unexpected error", e);
            }
        }
    }

    @Test
    public void TestFloatType() {
        Credential cred = new Credential(
                System.getenv("TENCENTCLOUD_SECRET_ID"),
                System.getenv("TENCENTCLOUD_SECRET_KEY")
        );

        IaiClient client = new IaiClient(cred, "ap-guangzhou");
        SearchFacesRequest req = new SearchFacesRequest();
        req.setGroupIds(new String[]{"test"});
        req.setUrl("https://www.test.com");

        try {
            client.SearchFaces(req);
            throw new RuntimeException("unexpected success");
        } catch (TencentCloudSDKException e) {
            if (!e.getErrorCode().contains("InvalidParameter")) {
                throw new RuntimeException("unexpected error", e);
            }
        }
    }
}
