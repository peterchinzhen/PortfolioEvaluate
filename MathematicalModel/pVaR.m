function y = pVaR(r)
% ����VaRֵ����
% ���룺
% r: ��ȯ�������� [m��n],mֻȯ��n�յ�������
% �����
% y: ����֤ȯ����ʷVaR������[m��1]

m=size(r,1);

iLen = size(r, 2);
if iLen <= 1 
  y = 0;
else
  r = sort(r, 2);
  %���㵱ǰ��λ��vCon��Ӧ��λ�ã����µ�һ����
  iForePos = 1 + floor(0.05 * (iLen - 1));
  %���㵱ǰ��λ�����뿿��λ�õ�λ��
  vMultiNum = 0.05 * (iLen - 1) - floor(0.05 * (iLen - 1));
  %ͨ��λ�Ƹ�����������������ʼ�Ȩ
  y = r(:, iForePos) + vMultiNum * (r(:, iForePos + 1) - r(:, iForePos));
end;