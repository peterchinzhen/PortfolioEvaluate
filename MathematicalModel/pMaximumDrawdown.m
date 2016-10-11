function y = pMaximumDrawdown(r)
% �������س�
% ���룺
% r: ��ȯ�������� [m��n],mֻȯ��n�յ�������,n=20,120,250,500
% �����
% y�����س�ֵ[m��1]

[m,n] = size(r);

% �޳���һ���������
r = r(:,2:end);

% �����ۼ�������
cum_r = cumprod(1 + r, 2) - 1;
% ��������ת���ɼ۸�
price = ones(m,n);
price(:,2:end) = ones(m,n-1).*(1+cum_r);

% �������س�
x = ones(m,n);
y = ones(m,1);
for i = 1:m
    for j = 1:n
        x(i,j) = price(i,j)/max(price(i,1:j))-1;
    end
    y(i) = min(x(i,:));
end
